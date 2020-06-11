package com.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.product"))
				.build();
	}
	
	 private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()              
	                .title("Nineleaps Product Management Service")
	                .description("This page lists all API's of Product Service") 
	                .version("1.0")
	                .contact(new Contact("Ashish Kumar", "https://nineleaps.com", "ashish.kumar@nineleaps.com"))
					.license("License 2.0")
					.licenseUrl("https://nineleaps.com/license.html")
					.build();
	    }
	 
}
