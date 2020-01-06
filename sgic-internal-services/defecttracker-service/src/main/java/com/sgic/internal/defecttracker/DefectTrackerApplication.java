package com.sgic.internal.defecttracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.web.client.RestTemplate;

import com.sgic.internal.defecttracker.defectservice.property.FileStorageProperties;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableConfigurationProperties({ FileStorageProperties.class })
@EntityScan(basePackageClasses = {
		DefectTrackerApplication.class,
		Jsr310JpaConverters.class
})
public class DefectTrackerApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(DefectTrackerApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	
	 @Bean
		public Docket swaggerConfiguration() {
			return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.apis(RequestHandlerSelectors.basePackage("com.sgic.internal.defecttracker.defectservice.controller"))
					.paths(PathSelectors.ant("/**"))
					.build();
		}
	
	
	
}
