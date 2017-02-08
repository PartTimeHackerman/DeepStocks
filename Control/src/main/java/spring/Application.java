package spring;

import binaryAPI.commands.active_symbols.ActiveSymbolsSend;
import binaryAPI.commands.ticks_history.TicksHistorySend;
import connection.Packet;
import connection.PacketStream;
import connection.Request;
import data.StockData;
import jdbc.dao.StockDataDAO;
import model.BinaryCandlesGather;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import packetHandler.ActiveSymbolsHandler;
import packetHandler.TicksHistoryHandler;
import utils.MainLogger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FlushModeType;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = {"data"})
@EntityScan({"binaryAPI", "jdbc", "spring", "data"})
@EnableJpaRepositories({"jdbc", "spring", "data"})
@ComponentScan({"jdbc", "spring", "data"})
public class Application implements CommandLineRunner {
	
	@Autowired
	private StockDataDAO stockDataDAO;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//StockData stock = stockDataDAO.findOne(10);
		//StockData test = stockDataFacadeDAO.findById(1);
		PacketStream packetStream = new PacketStream();
		List<StockData> stocks = new ArrayList<>();
		packetStream.addHandler(new TicksHistoryHandler(stocks));
		Request request = new Request();
		ActiveSymbolsHandler activeSymbolsHandler = new ActiveSymbolsHandler(stocks);
		activeSymbolsHandler.handle(request.sendAndGet(new Packet(new ActiveSymbolsSend())));
		BinaryCandlesGather binaryCandlesGather = new BinaryCandlesGather(request);
		
		StockData stock = stocks.get(0);
		//binaryCandlesGather.getCandlesT(stock, 1451606400L, System.currentTimeMillis());
		binaryCandlesGather.getCandlesT(stock, 1486121231L, System.currentTimeMillis());
		stockDataDAO.save(stock);
		
		MainLogger.log().info("Done!");
		System.exit(0);
		
	}
	
	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return args -> {
			
			System.out.println("Beans provided by Spring Boot:");
			
			String[] beanNames = context.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
			
		};
	}*/
}
