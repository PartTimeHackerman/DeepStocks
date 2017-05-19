package model.connection.proxy;


import scraper.Proxy;

public interface ProxyProvider {
	
	Proxy getProxy();
	
	void addProxy(Proxy proxy);
}
