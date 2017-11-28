package com.fia.aws.reinvent.notification;

import java.util.logging.Logger;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.fia.aws.reinvent.notification.service.rs.RestServiceImpl;

@Component
@ApplicationPath("/")
public class JerseyConfiguration extends ResourceConfig {
	private static final Logger log = Logger.getLogger(JerseyConfiguration.class.getName());
	
	@Autowired
    public JerseyConfiguration() {
    	//register(new ObjectMapperContextResolverNonNull());
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
        register(MultiPartFeature.class);
        register(RestServiceImpl.class);
        register(CORSFilter.class);
    }
	
	@Bean
	public Client jerseyClient() {
		return ClientBuilder.newClient(
				new ClientConfig()
				/*.register(DateTimeParamConverterProvider.class)*/
				);
	}
}
