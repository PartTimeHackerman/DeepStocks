package model.dataBaseUpdater;

import model.dao.BinaryDataDAO;
import model.data.BinaryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class BinaryDataDBUpdater implements DataBaseUpdater<Collection<BinaryData>> {
	
	private final BinaryDataDAO binaryDataDAO;
	private final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
	
	@Autowired
	public BinaryDataDBUpdater(BinaryDataDAO binaryDataDAO) {
		this.binaryDataDAO = binaryDataDAO;
	}
	
	@Override
	public void update(Collection<BinaryData> binaryData) {
		singleThreadExecutor.submit(() ->
											binaryDataDAO.save(binaryData));
	}
}
