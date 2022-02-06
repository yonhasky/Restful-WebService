package com.example.RestfulWebService.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@EnableWebMvc
@EnableSwagger2
public class SwaggerConfig {

	// http://localhost:8089/swagger-ui/index.html

	private static final Contact DEFAULT_CONTACT = new Contact("kim", "http://www.hh.co.kr", "yonhasky@naver.com");

	private static final ApiInfo DEFALT_API_INFO = new ApiInfo("Awesome API Title", "REST API", "1.0", "urn:tos",
			DEFAULT_CONTACT, "Apache 2.0", "http://www.apache", new ArrayList<>());
	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<>(
			Arrays.asList("application/json", "application.xml"));

	@Bean
	public Docket swagger() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFALT_API_INFO).produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	}

}
