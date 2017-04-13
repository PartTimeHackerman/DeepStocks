package model.connection.proxy;

import org.scraper.main.Proxy;

public interface ProxyProvider {
	
	Proxy getProxy();
	
	void addProxy(Proxy proxy);
}
