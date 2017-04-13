package spring;

import com.google.gson.Gson;
import model.binaryAPI.BinaryAPI;
import model.binaryAPI.commands.ticks_history.TicksHistorySend;
import model.connection.PacketSender;
import model.connection.proxy.ScraperManager;
import model.connection.proxy.UnrepeatedProxyProvider;
import model.data.Candle;
import model.dataUpdater.CandlesUpdaterDB;
import model.dataUpdater.StocksUpdater;
import model.connection.ReceivedPacketsStream;
import model.data.StockRepo;
import model.jdbc.dao.*;
import model.binaryAPI.BinaryPacketSender;
import model.packetHandler.TicksHandler;
import model.packetHandler.TicksHistoryHandler;
import model.utils.MainLogger;
import org.scraper.main.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Arrays;
import java.util.stream.IntStream;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan({"model.*", "spring"})
@EnableJpaRepositories({"model.*", "spring.*"})
@ComponentScan({"model", "spring"})
@EnableTransactionManagement
@Transactional
@EnableCaching
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
@CrossOrigin
public class Application implements CommandLineRunner {
	
	@Autowired
	private StockDAO stockDataDAO;
	
	@Autowired
	private StockRepo stockRepo;
	
	@Autowired
	private ReceivedPacketsStream receivedPacketsStream;
	
	@Autowired
	private BinaryDataDAO binaryDataDAO;
	
	@Autowired
	private StocksUpdater stocksUpdater;
	
	@Autowired
	private CandleDAOImpl candleDAO;
	
	@Autowired
	private CandlesUpdaterDB candlesUpdaterDB;
	
	@Autowired
	private BinaryPacketSender packetManager;
	
	@Autowired
	private PacketSender packetSender;
	
	@Autowired
	private UnrepeatedProxyProvider unrepeatedProxyProvider;
	
	@Autowired
	private ScraperManager scraperManager;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//stockRepo.findAll();
		//Integer i = stockRepo.getStocks().get(0).getStockCandles().size();
		//Candle i = candleDAO.getCrudDAO().findTopByStockOrderByEpochDesc(stockRepo.getStocks().get(0));
		//System.out.printf(i+"");
		/*scraperManager.addProxyProvider(unrepeatedProxyProvider);
		Proxy proxy = unrepeatedProxyProvider.getProxy();
		
		IntStream.range(0,100).forEach(i -> unrepeatedProxyProvider.getProxy());
		MainLogger.log().info(proxy);
		receivedPacketsStream
				//.addHandler(new ActiveSymbolsHandler(stockRepo.getStocks()))
				.addHandler(new TicksHandler(stockRepo.getStocks()))
				.addHandler(new TicksHistoryHandler(stockRepo.getStocks()));

		Gson gson = new Gson();
		//BinaryAPI binaryAPI2 = new BinaryAPI(packetManager, gson, "127.0.0.1", "80");

		//PacketSender packetSender2 = new PacketSender(new BinaryPacketSender(receivedPacketsStream));

		TicksHistorySend ticksHistory = new TicksHistorySend();
		ticksHistory.setTicksHistory("AEX");
		ticksHistory.setStart(1488116600L);
		ticksHistory.setEnd(1488116600L+"");
		ticksHistory.setCount(1);
		ticksHistory.setGranularity(60);
		ticksHistory.setStyle(TicksHistorySend.Style.CANDLES);

		for (int i = 0; i < 250; i++) {
			MainLogger.log().info("sender one " + i);
			packetSender.sendAndGet(ticksHistory);
		}

		MainLogger.log().info("sender two!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		for (int i = 0; i < 250; i++) {
			MainLogger.log().info("sender two " + i);
			//packetSender2.sendAndGet(ticksHistory);
		}


		//stockRepo.getStocks().forEach(stock -> MainLogger.log().info(stock.getStockCandles().size()));

		stocksUpdater.updateStocks(stockRepo.getStocks());

		candlesUpdaterDB.updateStocks(stockRepo.getStocks());

		stockDataDAO.save(stockRepo.getStocks());

		MainLogger.log().info("Done!xD");
		//stockDataDAO.save(stock);
		//System.exit(0);*/
		
	}
	
	/*
		@Bean
		public HibernateJpaSessionFactoryBean sessionFactory() {
			return new HibernateJpaSessionFactoryBean();
		}
	
		@Bean
		public SessionFactory getSessionFactory() {
			if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
				throw new NullPointerException("factory is not a hibernate factory");
			}
			return entityManagerFactory.unwrap(SessionFactory.class);
		}
		*/
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
