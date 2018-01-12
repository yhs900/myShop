package com.showtimer;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement//启用注解事物
@SpringBootApplication
@MapperScan("com.showtimer.mapper")
public class ShowTimerApplication extends SpringBootServletInitializer{

	
	public static void main(String[] args) {
		SpringApplication.run(ShowTimerApplication.class, args);
		System.err.println("myaction is start!!!!!!!!");
	}
	
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(ShowTimerApplication.class);
	}
}
