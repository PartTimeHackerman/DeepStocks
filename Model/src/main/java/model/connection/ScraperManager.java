package model.connection;

import org.scraper.MVC.model.SitesUtility;
import org.scraper.main.Proxy;
import org.scraper.main.Scraper;
import org.scraper.main.data.Site;
import org.scraper.main.manager.SitesRepo;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class ScraperManager {
	
	private Scraper scraper;
	
	private Integer threads = 100;
	
	private Integer timeout = 10000;
	
	private Integer limit = 30;
	
	private Boolean check = true;
	
	private Integer browsers = 5;
	
	private Integer ocrs = 5;
	
	private List<Proxy> proxies;
	
	private Set<Proxy> usedProxies = new HashSet<>();
	
	public ScraperManager() {
	}
	
	public void create() {
		if (scraper == null)
			scraper = new Scraper(threads, timeout, limit, check, browsers, ocrs);
		else
			scraper.create();
		proxies = scraper.getProxyRepo().getAll();
	}
	
	public void scrapeSites() {
		Collection<Site> sitesToScrape = getSitesWithAvgWorkingProxies(5);
		scraper.getProxyScraper().scrapeList(sitesToScrape);
	}
	
	private Collection<Site> getSitesWithAvgWorkingProxies(Integer minWorking) {
		SitesRepo sitesRepo = scraper.getSitesRepo();
		SitesUtility sitesUtility = scraper.getSitesUtility();
		Collection<Site> sites = sitesRepo.getWorking();
		sites = sitesUtility.filterAvgWorking(minWorking);
		return sites;
	}
	
	public void dispose() {
		scraper.dispose();
	}
	
	public Proxy getProxy() {
		Proxy proxy = proxies.get(0);
		proxies.remove(proxy);
		usedProxies.add(proxy);
		return proxy;
	}
	
}
