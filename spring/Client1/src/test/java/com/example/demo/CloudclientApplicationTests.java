package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudclientApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Test
	public void testRestApi(){
		RestTemplate restTemplate = new RestTemplate();
		String str = restTemplate.getForObject("http:server1/server1Index", String.class);
		System.out.println(str);
	}
}
