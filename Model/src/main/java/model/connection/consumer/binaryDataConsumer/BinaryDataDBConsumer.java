package model.connection.consumer.binaryDataConsumer;

import model.connection.consumer.Consumer;
import model.data.BinaryData;
import model.dataBaseUpdater.BinaryDataDBUpdater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BinaryDataDBConsumer implements Consumer<Collection<BinaryData>> {
	
	private final BinaryDataDBUpdater binaryDataDBUpdater;
	
	@Autowired
	public BinaryDataDBConsumer(BinaryDataDBUpdater binaryDataDBUpdater) {
		this.binaryDataDBUpdater = binaryDataDBUpdater;
	}
	
	@Override
	public void consume(Collection<BinaryData> binaryDataList) {
		binaryDataDBUpdater.update(binaryDataList);
	}
	
}
