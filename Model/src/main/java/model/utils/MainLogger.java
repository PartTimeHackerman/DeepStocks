package model.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.OutputStreamAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.layout.PatternLayout;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MainLogger {
	
	private static MainLogger logger;
	
	private final String name = MainLogger.class.getSimpleName();
	
	private final LoggerOutputStream out = new LoggerOutputStream();
	
	private static final Map<Class, Logger> loggersMap = new HashMap<>();
	
	private MainLogger() {
		addAppender(out, name);
	}
	
	public static MainLogger getInstance() {
		if (logger == null) {
			synchronized (MainLogger.class) {
				if (logger == null)
					logger = new MainLogger();
			}
		}
		return logger;
	}
	
	public static Logger log(Object o) {
		return log(o.getClass());
	}
	
	public static Logger log(Class clazz) {
		return loggersMap.computeIfAbsent(clazz, c -> LogManager.getLogger(c.getName()));
	}
	
	public static LoggerOutputStream out() {
		return getInstance().out;
	}
	
	private void addAppender(final OutputStream outputStream, final String outputStreamName) {
		LoggerContext context = LoggerContext.getContext(false);
		Configuration config = context.getConfiguration();
		PatternLayout layout = PatternLayout.createDefaultLayout(config);
		
		Appender appender = OutputStreamAppender.createAppender(layout, null, outputStream, outputStreamName, false, true);
		appender.start();
		config.addAppender(appender);
		
		for (final LoggerConfig loggerConfig : config.getLoggers().values()) {
			loggerConfig.addAppender(appender, null, null);
		}
		config.getRootLogger().addAppender(appender, null, null);
	}
	
	public class LoggerOutputStream extends OutputStream {
		StringBuilder text = new StringBuilder();
		
		List<Consumer<String>> consumers = new ArrayList<>();
		
		@Override
		public void write(int b) {
			if (b == 0 || b == 13)
				return;
			if (b == 10) {
				commit();
				return;
			}
			int[] bytes = {b};
			write(bytes, 0, bytes.length);
		}
		
		public void write(int[] bytes, int offset, int length) {
			String s = new String(bytes, offset, length);
			text.append(s);
		}
		
		public void commit() {
			consumers.forEach(consumer ->
									  consumer.accept(text.toString()));
			text = new StringBuilder();
		}
		
		public void addConsumer(Consumer<String> consumer) {
			consumers.add(consumer);
		}
	}
	
}
