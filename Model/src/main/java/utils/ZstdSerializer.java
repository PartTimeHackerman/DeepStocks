package utils;

import com.github.luben.zstd.Zstd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class ZstdSerializer implements ISerializer {
	
	@Override
	public <T extends Serializable> void serialize(T data, FileOutputStream out) {
		try {
			byte[] objBytes = BytesUtils.toByteSimple(data);
			byte[] compressed = Zstd.compress(objBytes,1);
			
			FileUtil.writeSimple(compressed, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public <T extends Serializable> T deserialize(Class<T> clazz, FileInputStream in) {
		try {
			byte[] compressed = FileUtil.load(in);
			byte[] objBytes = Zstd.decompress(compressed, (int) Zstd.decompressedSize(compressed));
			return (T) BytesUtils.toObject(objBytes);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
