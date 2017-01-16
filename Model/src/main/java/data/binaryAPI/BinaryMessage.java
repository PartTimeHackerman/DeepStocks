package data.binaryAPI;

import data.Message;

public interface BinaryMessage extends Message {
	
	void setReqId(Integer id);
	
	Integer getReqId();
	
}
