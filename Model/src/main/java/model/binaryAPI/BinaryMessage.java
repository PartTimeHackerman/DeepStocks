package model.binaryAPI;

import model.connection.Message;

public interface BinaryMessage extends Message {
	
	Integer getReqId();
	
	void setReqId(Integer id);
	
}
