package com.jd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot启动类
 *
 *
 */
@SpringBootApplication
@MapperScan("com.jd.mapper") //@MapperScan 用户扫描MyBatis的Mapper接口
public class Start {

	public static void main(String[] args) {
		SpringApplication.run(Start.class, args);
	}
}
