package utils;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class FileUtil
{
	
	public final static byte[] loadSimple(FileInputStream in) throws IOException {
		return IOUtils.toByteArray(in);
	}
	
	public final static void writeSimple(byte[] bytes, FileOutputStream out) throws IOException {
		IOUtils.write(bytes, out);
	}
	
	public final static byte[] load(String fileName)
	{
		try {
			FileInputStream fin=new FileInputStream(fileName);
			return load(fin);
		}
		catch (Exception e) {
			
			return new byte[0];
		}
	}
	
	public final static byte[] load(File file)
	{
		try {
			FileInputStream fin=new FileInputStream(file);
			return load(fin);
		}
		catch (Exception e) {
			
			return new byte[0];
		}
	}
	
	public final static byte[] load(FileInputStream fin) {
		byte readBuf[] = new byte[512*1024];
		
		try {
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			
			int readCnt = fin.read(readBuf);
			while (0 < readCnt) {
				bout.write(readBuf, 0, readCnt);
				readCnt = fin.read(readBuf);
			}
			
			fin.close();
			
			return bout.toByteArray();
		}
		catch (Exception e) {
			
			return new byte[0];
		}
	}
	
	private static void writeBytesToFile(byte[] bFile, String fileDest) {
		
		try (FileOutputStream fileOuputStream = new FileOutputStream(fileDest)) {
			fileOuputStream.write(bFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void writeBytesToFileNio(byte[] bFile, String fileDest) {
		
		try {
			Path path = Paths.get(fileDest);
			Files.write(path, bFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}

