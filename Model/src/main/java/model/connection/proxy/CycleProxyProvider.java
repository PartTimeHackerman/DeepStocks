package model.connection.proxy;

import org.scraper.main.Proxy;
import org.springframework.stereotype.Service;

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
}
