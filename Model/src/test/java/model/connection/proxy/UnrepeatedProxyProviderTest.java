package model.connection.proxy;

import model.SpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import scraper.Proxy;

import static org.junit.Assert.assertNotNull;

public class UnrepeatedProxyProviderTest extends SpringTest {
	
	@Autowired
	private UnrepeatedProxyProvider unrepeatedProxyProvider;
	
	@Test
	public void getProxy() throws Exception {
		Proxy proxy = unrepeatedProxyProvider.getProxy();
		assertNotNull(1);
	}
}