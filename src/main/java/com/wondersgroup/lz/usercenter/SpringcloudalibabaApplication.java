package com.wondersgroup.lz.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.wondersgroup.lz")
@SpringBootApplication
public class SpringcloudalibabaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudalibabaApplication.class, args);
    }

}
