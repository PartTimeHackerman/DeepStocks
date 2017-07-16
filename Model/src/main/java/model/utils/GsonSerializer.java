package model.utils;

import com.google.gson.Gson;

public class GsonSerializer {
	
	private static final Gson gson = new Gson();
	
	public static String toJson(Object o) {
		return gson.toJson(o);
	}
	
	public static <T> T fromJson(Class<T> clazz, String json) {
		return gson.fromJson(json, clazz);
	}
	
	/*public static List<Stock> loadStocksData() {
		return loadJsons("stocks/", Stock.class);
	}
	
	public static void saveStocksData(List<Stock> stocksData) {
		for (Stock data : stocksData) {
			saveJsons(data, "stocks/", data.getName().replace("/","_"));
		}
	}
	
	private static <T> List<T> loadJsons(String path, Class<T> clazz) {
		List<T> list = new ArrayList<>();
		
		createDirIfNotExists(path);
		Collection<File> files = FileUtils.listFiles(new File(path), new WildcardFileFilter("*.json"), null);
		
		for (File file : files) {
			String json = "";
			try {
				json = Files.lines(file.toPath()).collect(Collectors.joining());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			T obj = null;
			try {
				obj = gson.fromJson(json, clazz);
			} catch (JsonSyntaxException e){
				System.out.println(json);
				obj = gson.fromJson(json.substring(0,json.length()-1), clazz);
			}
			list.add(obj);
		}
		return list;
	}
	
	private static <T> void saveJsons(T data, String path, String name) {
		String json = gson.toJson(data);
		File file = new File(path + name + ".json");
		try {
			FileUtils.write(file, json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void createDirIfNotExists(String dir){
		File file = new File(dir);
		
		if(!file.exists())
			file.mkdirs();
	}*/
	
}
