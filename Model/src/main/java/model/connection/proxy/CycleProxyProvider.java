package model.connection.proxy;

import org.springframework.stereotype.Service;
import scraper.Proxy;

import java.util.Vector;

@Service
public class CycleProxyProvider implements ProxyProvider {
	
	private Vector<Proxy> proxies = new Vector<>();
	
	@Override
	public Proxy getProxy() {
		Proxy proxy = proxies.remove(0); //TODO Handle NoSuchElementEx
		proxies.add(proxy);
		return proxy;
	}
	
	@Override
	public void addProxy(Proxy proxy) {
		proxies.add(proxy);
	}
}
