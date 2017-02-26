package model.binaryAPI;

import model.connection.Message;

public interface BinaryMessage extends Message {
	
	void setReqId(Integer id);
	
	Integer getReqId();
	
}
