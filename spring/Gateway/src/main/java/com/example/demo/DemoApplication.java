package com.example.demo;

import com.example.demo.filters.SimpleFilter;
import com.example.demo.filters.TestOrderFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public SimpleFilter simpleFilter(){
		return  new SimpleFilter();
	}
	/*@Bean
	public TestOrderFilter testOrderFilter(){
		return  new TestOrderFilter();
	}*/
}
