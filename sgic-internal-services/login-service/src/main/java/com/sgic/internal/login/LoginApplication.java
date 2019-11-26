package com.sgic.internal.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class LoginApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(LoginApplication.class, args);
    }
    
    @Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
