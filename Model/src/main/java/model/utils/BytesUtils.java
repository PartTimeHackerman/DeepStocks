package model.utils;

import org.apache.commons.lang3.SerializationUtils;

import java.io.*;

public class BytesUtils {
	
	public static byte[] toByteSimple(Serializable obj) {
		return SerializationUtils.serialize(obj);
	}
	
	public static <T> T toByteSimple(byte[] bytes) {
		return SerializationUtils.deserialize(bytes);
	}
	
	public static byte[] toByteArray(Object obj) throws IOException {
		byte[] bytes = null;
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(obj);
			oos.flush();
			bytes = bos.toByteArray();
		} finally {
			if (oos != null) {
				oos.close();
			}
			if (bos != null) {
				bos.close();
			}
		}
		return bytes;
	}
	
	public static Object toObject(byte[] bytes) throws IOException, ClassNotFoundException {
		Object obj = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			bis = new ByteArrayInputStream(bytes);
			ois = new ObjectInputStream(bis);
			obj = ois.readObject();
		} finally {
			if (bis != null) {
				bis.close();
			}
			if (ois != null) {
				ois.close();
			}
		}
		return obj;
	}
	
	public static String toString(byte[] bytes) {
		return new String(bytes);
	}
}

