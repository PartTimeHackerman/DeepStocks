import model.connection.proxy.UnrepeatedProxyProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import scraper.Proxy;
import spring.Application;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
public class UnrepeatedProxyProviderTest {
	
	@Autowired
	private UnrepeatedProxyProvider unrepeatedProxyProvider;
	
	@Test
	public void getProxy() throws Exception {
		Proxy proxy = unrepeatedProxyProvider.getProxy();
		assertNotNull(proxy);
	}
	
}