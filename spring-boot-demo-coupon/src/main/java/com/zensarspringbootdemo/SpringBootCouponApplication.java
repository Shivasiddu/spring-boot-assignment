package com.zensarspringbootdemo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = { "com.zensarspringbootdemo" })
public class SpringBootCouponApplication {

	/*
	 * public class SpringBootCouponApplication extends
	 * SpringBootServletInitializer{
	 * 
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder builder) {
	 * 
	 * return super.configure(builder); }
	 */

	public static void main(String[] args) {
		System.out.println("shiva");
		SpringApplication.run(SpringBootCouponApplication.class, args);
		System.out.println("siddu");
		System.out.println("let's start");
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}