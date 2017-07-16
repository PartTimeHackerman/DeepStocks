package model.connection.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scraper.Proxy;

import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

@Service
public class UnrepeatedProxyProvider implements ProxyProvider {
	
	private final ScraperManager scraperManager;
	private final List<Proxy> proxies = new Vector<>();
	private final List<Proxy> usedProxies = new Vector<>();
	
	@Autowired
	public UnrepeatedProxyProvider(ScraperManager scraperManager) {
		this.scraperManager = scraperManager;
		scraperManager.addProxyProvider(this);
	}
	
	@Override
	public Proxy getProxy() {
		Proxy proxy;
		
		if (proxies.size() < 10)
			requireNewProxies();
		
		try {
			proxy = proxies.get(0);
		} catch (ArrayIndexOutOfBoundsException e) {
			while (proxies.isEmpty()) {
				requireNewProxies();
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			proxy = proxies.get(0);
		}
		
		proxies.remove(proxy);
		usedProxies.add(proxy);
		return proxy;
	}
	
	@Override
	public void addProxy(Proxy proxy) {
		if (!usedProxies.contains(proxy))
			proxies.add(proxy);
		proxies.sort(Comparator.comparingLong(Proxy::getSpeed));
	}
	
	private void requireNewProxies() {
		scraperManager.scrapeNextSite();
	}
	
}
