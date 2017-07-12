package model.connection.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

import java.util.List;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
	
	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		// use the /topic prefix for outgoing WebSocket communication
		config.enableSimpleBroker("/topic", "/queue", "/data");
		
		// use the /app prefix for others
		config.setApplicationDestinationPrefixes("/app");
	}
	
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/endpoint").setAllowedOrigins("*").withSockJS();
	}
	
	@Override
	public void configureClientInboundChannel(ChannelRegistration channelRegistration) {
	}
	
	@Override
	public void configureClientOutboundChannel(ChannelRegistration channelRegistration) {
	}
	
	@Override
	public boolean configureMessageConverters(List<MessageConverter> converters) {
		return true;
	}
}
