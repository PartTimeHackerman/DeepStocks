package model.utils;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

public class KryoSerializer implements ISerializer {
	
	Kryo kryo = new Kryo();
	
	@Override
	public <T extends Serializable> void serialize(T data, FileOutputStream out) {
		Output output = new Output(out);
		kryo.writeObject(output, data);
		output.close();
	}
	
	@Override
	public <T extends Serializable> T deserialize(Class<T> clazz, FileInputStream in) {
		Input input = new Input(in);
		T object = kryo.readObject(input, clazz);
		input.close();
		return object;
	}
}
