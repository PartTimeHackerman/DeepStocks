package spring.controller;

import model.data.Stock;
import model.jdbc.dao.StockDAO;
import model.utils.MainLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageType;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.websocket.STOMPConnectEventListener;

@RestController
@RequestMapping("/data")
public class StocksController {
	
	private final StockDAO stockDAO;
	
	@Autowired
	public StocksController(StockDAO stockDAO) {
		this.stockDAO = stockDAO;
	}
	
	@RequestMapping(value = "/stocksPage", method = RequestMethod.GET)
	public Page<Stock> getStocksPage(Pageable page){
		Page<Stock> stocks = stockDAO.findAll(page);
		return stocks;
	}
}
