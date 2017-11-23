package com.jk;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by yangzhichao on 2017-11-14.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.print("唱个歌");

    }
}
