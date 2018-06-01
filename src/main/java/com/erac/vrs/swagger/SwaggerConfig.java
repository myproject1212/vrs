package com.erac.vrs.swagger;

import static springfox.documentation.builders.PathSelectors.any;
import static springfox.documentation.builders.RequestHandlerSelectors.withClassAnnotation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Autowired
  private SwaggerConfigProperties swaggerConfigProperties;

  @Bean
  public Docket productApi() {
    // @formatter:off
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .select()
        .apis(withClassAnnotation(RestController.class))
        .paths(any())
        .build();
    // @formatter:on
  }

  private ApiInfo apiInfo() {
    return new ApiInfo(swaggerConfigProperties.getAppName(), swaggerConfigProperties.getDescription(), swaggerConfigProperties.getApiVersion(), null,
        new Contact(swaggerConfigProperties.getContactEmail(), swaggerConfigProperties.getInfoUrl(), swaggerConfigProperties.getContactEmail()), null,
        null, new ArrayList<>());
  }
}
