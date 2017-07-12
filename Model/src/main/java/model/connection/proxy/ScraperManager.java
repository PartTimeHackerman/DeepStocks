package model.connection.proxy;

import model.utils.MainLogger;
import org.springframework.stereotype.Component;
import scraper.Proxy;
import scraper.Scraper;
import scraper.data.Site;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

@Component
public class ScraperManager {
	
	private Scraper scraper;
	
	private Integer threads = 100;
	
	private Integer timeout = 10000;
	
	private Integer limit = Integer.MAX_VALUE;
	
	private Boolean check = true;
	
	private Integer browsers = 5;
	
	private Integer ocrs = 5;
	
	private Integer minProxies = 10;
	
	private Integer maxProxiesToScrape = 30;
	
	private Set<ProxyProvider> proxyProviders = new HashSet<>();
	
	private List<Proxy> workingProxies;
	
	private Set<Proxy> usedProxies = new HashSet<>();
	
	private Vector<Site> sitesCycle = new Vector<>();
	
	
	public ScraperManager() {
	}
	
	public void addProxyProvider(ProxyProvider proxyProvider) {
		proxyProviders.add(proxyProvider);
	}
	
	public void create() {
		if (scraper == null) {
			scraper = new Scraper(threads, timeout, limit, check, browsers, ocrs);
			scraper.create();
			//scraper.getProxyScraper().addObserver((o, arg) -> dispose());
		} else {
			scraper.create();
		}
		
		workingProxies = scraper.getProxyRepo().getWorking();
		scraper.getProxyRepo().getWorkingStream().subscribe(this::notifyProviders);
		sitesCycle = new Vector<>(getSitesWithAvgWorkingProxies(5));
	}
	
	public void scrapeSites() {
		Collection<Site> sitesToScrape = getSitesWithAvgWorkingProxies(5);
		scraper.getProxyScraper().scrapeList(sitesToScrape);
	}
	
	private Collection<Site> getSitesWithAvgWorkingProxies(Integer minWorking) {
		List<Site> sites = new ArrayList<>(scraper.getSitesUtility().getSitesFilter().filterAvgWorking(minWorking, scraper.getSitesRepo().getAll()));
		sites.removeIf(site -> site.getAvgProxies() <= 0);
		sites.sort(Comparator.comparingDouble(s -> ((double) s.getAvgWorkingProxies() / s.getAvgProxies())));
		Collections.reverse(sites);
		return sites;
	}
	
	public void dispose() {
		scraper.dispose();
	}
	
	public void scrapeNextSite() {
		if (scraper == null || !scraper.isCreated())
			create();
		
		scraper.getLimiter().clear();
		scraper.getLimiter().setLimit(maxProxiesToScrape);
		if (isScraping())
			return;
		Site site = sitesCycle.remove(0);
		sitesCycle.add(site);
		scraper.getSitesUtility().scrape(site);
	}
	
	private void notifyProviders(Proxy proxy) {
		proxyProviders.forEach(proxyProvider ->
									   proxyProvider.addProxy(proxy));
	}
	
	private Boolean isScraping() {
		return scraper.getPool().getExecutor().getActiveCount() > 0;
	}
	
}
