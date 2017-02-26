package model.utils;

import java.io.*;

public class Serializer {
	
	ISerializer serializer;
	
	public Serializer(ISerializer serializer){
		this.serializer = serializer;
	}
	
	public <T extends Serializable> void serialize(T data, String path, String name) {
		try {
			new File(path).mkdir();
			FileOutputStream fileOut = new FileOutputStream(path + "/" + name + ".ser");
			serializer.serialize(data, fileOut);
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
	
	public <T extends Serializable> T deserialize(Class<T> clazz, String path, String name) {
		T object = null;
		try {
			FileInputStream fileIn = new FileInputStream(path + "/" + name);
			object = serializer.deserialize(clazz, fileIn);
			fileIn.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return object;
	}
	
}
