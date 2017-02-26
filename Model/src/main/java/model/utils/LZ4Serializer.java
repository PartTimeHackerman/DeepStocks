package model.utils;

import io.airlift.compress.lz4.Lz4Compressor;
import io.airlift.compress.lz4.Lz4Decompressor;
import net.jpountz.lz4.LZ4Compressor;
import net.jpountz.lz4.LZ4Factory;
import net.jpountz.lz4.LZ4SafeDecompressor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class LZ4Serializer implements ISerializer {
	
	private Lz4Compressor compressor = new Lz4Compressor();
	
	private Lz4Decompressor decompressor = new Lz4Decompressor();
	
	LZ4Factory factory = LZ4Factory.fastestInstance();
	
	@Override
	public <T extends Serializable> void serialize(T data, FileOutputStream out) {
		try {
			/*ByteBuffer objBytes = ByteBuffer.wrap(BytesUtils.toByteSimple(data));
			
			ByteBuffer compressed = ByteBuffer.allocate(compressor.maxCompressedLength(objBytes.array().length));
			
			compressor.compress(objBytes, compressed);*/
			
			byte[] objBytes = BytesUtils.toByteSimple(data);
			LZ4Compressor compressor = factory.highCompressor();
			int maxCompressedLength = compressor.maxCompressedLength(objBytes.length);
			byte[] compressed = new byte[maxCompressedLength];
			int compressedLength = compressor.compress(
					objBytes, 0, objBytes.length,
					compressed, 0, maxCompressedLength);
			
					
			FileUtil.writeSimple(compressed, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public <T extends Serializable> T deserialize(Class<T> clazz, FileInputStream in) {
		try {
			/*byte[] compressed = FileUtil.load(in);
			byte[] objBytes = Zstd.decompress(compressed, (int) Zstd.decompressedSize(compressed));
			ByteBuffer objBytes = ByteBuffer.wrap(BytesUtils.toByteSimple(data));
			ByteBuffer compressed = ByteBuffer.allocate(compressor.maxCompressedLength(objBytes.array().length));
			decompressor.decompress(compressed, objBytes);*/
			
			byte[] compressed = FileUtil.load(in);
			
			LZ4SafeDecompressor decompressor2 = factory.safeDecompressor();
			byte[] objBytes = decompressor2.decompress(
					compressed, compressed.length * 100);
			return (T) BytesUtils.toObject(objBytes);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
