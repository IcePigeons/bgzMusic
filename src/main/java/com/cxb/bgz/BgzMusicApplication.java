package com.cxb.bgz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.cxb.bgz.dao")
public class BgzMusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(BgzMusicApplication.class, args);
    }

}
