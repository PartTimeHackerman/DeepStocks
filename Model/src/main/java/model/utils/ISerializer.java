package model.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

public interface ISerializer {
	
	<T extends Serializable> void serialize(T data, FileOutputStream out);
	
	<T extends Serializable> T deserialize(Class<T> clazz, FileInputStream in);
	
}
