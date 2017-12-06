package org.cbioportal.staging.web.config;

import org.cbioportal.staging.web.config.annotation.InternalApi;
import org.cbioportal.staging.web.config.annotation.PublicApi;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket publicApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.withClassAnnotation(PublicApi.class))
            .build()
            .useDefaultResponseMessages(false)
            .protocols(new HashSet<>(Arrays.asList("http", "https")))
            .apiInfo(apiInfo());
    }

    @Bean
    public Docket internalApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("internal")
            .select()
            .apis(RequestHandlerSelectors.withClassAnnotation(InternalApi.class))
            .build()
            .useDefaultResponseMessages(false)
            .protocols(new HashSet<>(Arrays.asList("http", "https")))
            .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
            "cBioPortal Staging web API [Beta]",
            "Web services for cBioPortal Staging App. ",
            "1.0 (beta)",
            "http://www.thehyve.nl",
            new Contact("cBioPortal at The Hyve", "www.thehyve.nl", "cancergenomics@thehyve.nl"),
            "License",
            "https://github.com/thehyve/cbioportal-staging/blob/master/LICENSE");
        return apiInfo;
    }
}
