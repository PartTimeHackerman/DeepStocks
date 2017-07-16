package model.connection.proxy;

import org.springframework.stereotype.Service;
import scraper.Proxy;

import java.util.concurrent.LinkedBlockingQueue;

@Service
public class CycleProxyProvider implements ProxyProvider {
	
	private final LinkedBlockingQueue<Proxy> proxies = new LinkedBlockingQueue<>();
	
	@Override
	public Proxy getProxy() {
		Proxy proxy = proxies.poll(); //TODO Handle NoSuchElementEx
		if (proxy == null)
			return getProxy();
		proxies.offer(proxy);
		return proxy;
	}
	
	@Override
	public void addProxy(Proxy proxy) {
		proxies.offer(proxy);
	}
}
