package com.cxb.bgz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @Author 冰鸽子
 * @Date 2021/9/15 16:00
 */
@Configuration
@EnableOpenApi  //开启swagger3
public class SwaggerConfig {
    @Bean
    public Docket docket(Environment environment){
        Profiles profiles = Profiles.of("dev","test");
        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo())
                .enable(flag)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cxb.bgz.controller"))
                .build();
    }

    //配置swagger信息==>apiInfo(项目冰鸽子信息)
    private ApiInfo apiInfo(){
        return new ApiInfo("冰鸽子音乐网站接口文档",
                "前后端分离项目",
                "v1.0",
                "urn:tos",
                new Contact("冰鸽子", "无", "xxx@.com"),
                "Apache 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
