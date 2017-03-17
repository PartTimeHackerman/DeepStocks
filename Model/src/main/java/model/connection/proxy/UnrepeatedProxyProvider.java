package model.connection.proxy;

import org.scraper.main.Proxy;
import org.springframework.stereotype.Service;

import java.util.TreeSet;

@Service
public class UnrepeatedProxyProvider implements ProxyProvider {
	
	private TreeSet<Proxy> proxies = new TreeSet<>();
	private TreeSet<Proxy> usedProxies = new TreeSet<>();
	
	@Override
	public Proxy getProxy() {
		Proxy proxy = proxies.first(); //TODO Handle NoSuchElementEx
		proxies.remove(proxy);
		usedProxies.add(proxy);
		return proxy;
	}
}
