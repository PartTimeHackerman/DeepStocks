package spring;

import model.binaryAPI.BinaryCandlesGather;
import model.binaryAPI.BinaryDataGather;
import model.connection.PacketSender;
import model.connection.consumer.binaryDataConsumer.BinaryDataDBConsumer;
import model.connection.consumer.binaryDataConsumer.WebSocketBinaryDataUpdater;
import model.connection.consumer.candlesConsumer.CandlesDBConsumer;
import model.connection.handleUpdater.CandlesStockUpdater;
import model.connection.consumer.candlesConsumer.WebSocketCandlesUpdater;
import model.connection.packetHandler.ActiveSymbolsHandler;
import model.connection.packetHandler.TicksHistoryHandler;
import model.connection.packetsService.RequestValidator;
import model.connection.proxy.ScraperManager;
import model.connection.proxy.UnrepeatedProxyProvider;
import model.connection.serverUpdater.MinuteStockUpdater;
import model.connection.websocketServer.STOMPStocksController;
import model.dao.BinaryDataDAO;
import model.dao.StockDAO;
import model.data.Stock;
import model.connection.handleUpdater.StocksBinaryDataUpdater;
import model.connection.ReceivedPacketsStream;
import model.data.StockRepo;
import model.binaryAPI.BinaryPacketsService;
import model.utils.MainLogger;
import model.utils.StockExcluder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.*;

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
	private StockDAO stockDAO;
	
	@Autowired
	private StockRepo stockRepo;
	
	@Autowired
	private ReceivedPacketsStream receivedPacketsStream;
	
	@Autowired
	private BinaryDataDAO binaryDataDAO;
	
	@Autowired
	private StocksBinaryDataUpdater stocksUpdater;
	
	
	@Autowired
	private BinaryPacketsService packetManager;
	
	@Autowired
	private PacketSender packetSender;
	
	@Autowired
	private UnrepeatedProxyProvider unrepeatedProxyProvider;
	
	@Autowired
	private ScraperManager scraperManager;
	
	@Autowired
	private STOMPStocksController stompStocksController;
	
	@Autowired
	private TicksHistoryHandler ticksHistoryHandler;
	
	@Autowired
	private CandlesDBConsumer candlesDBUpdater;
	
	@Autowired
	private CandlesStockUpdater candlesStockUpdater;
	
	@Autowired
	private WebSocketCandlesUpdater webSocketCandlesUpdater;
	
	@Autowired
	private RequestValidator requestValidator;
	
	@Autowired
	private BinaryDataGather binaryDataGather;
	
	@Autowired
	private ActiveSymbolsHandler activeSymbolsHandler;
	
	@Autowired
	private BinaryDataDBConsumer binaryDataDBUpdater;
	
	@Autowired
	private StocksBinaryDataUpdater stocksBinaryDataUpdater;
	
	@Autowired
	private WebSocketBinaryDataUpdater webSocketBinaryDataUpdater;
	
	@Autowired
	private BinaryCandlesGather binaryCandlesGather;
	
	@Autowired
	private MinuteStockUpdater minuteStockUpdater;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		/*BinaryData consumers*/
		activeSymbolsHandler.subscribe(binaryDataDBUpdater);
		activeSymbolsHandler.subscribe(webSocketBinaryDataUpdater);
		
		/*Candles consumers*/
		ticksHistoryHandler.subscribe(candlesDBUpdater);
		ticksHistoryHandler.subscribe(webSocketCandlesUpdater);
		
		requestValidator.setResend(true);
		requestValidator.getBackups().forEach(packetSender::send);
		
		Collection<Stock> stocks = stockRepo.getStocks();
		StockExcluder.excludeVolatility(stocks);
		
		binaryDataGather.fetchBinaryDatas();
		
		stocks.parallelStream().forEach(stock -> {
			binaryCandlesGather.getLatestCandles(stock);
		});
		
		minuteStockUpdater.start();
		
		MainLogger.log(this).info("!!!!!!!!DONE!!!!!!!");
		
		/*new Thread(() -> IntStream.range(0, 10000).forEach(i -> {
			try {
				//binaryDataGather.fetchBinaryDatas();
				stocks.parallelStream().forEach(stock -> {
					binaryCandlesGather.getCandles(stock, EpochUtil.getCurrentTimeSeconds()-1, EpochUtil.getCurrentTimeSeconds());
				});
				Thread.sleep(60000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		})).run();*/
		
		/*BinaryData data = stockRepo.getStocks().get(1).getBinaryDataList();
		
		new Thread(() -> {
			IntStream.range(0, 10000).forEach(i -> {
				try {
					data.setSpot((double) Math.round(Math.random()*3));
					stompStocksController.updateStockBinaryData(data);
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}).run();*/
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

		stocksUpdater.updateForStocks(stockRepo.getStocks());

		candlesUpdaterDB.updateForStocks(stockRepo.getStocks());

		stockDAO.save(stockRepo.getStocks());

		MainLogger.log().info("Done!xD");
		//stockDAO.save(stock);
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
