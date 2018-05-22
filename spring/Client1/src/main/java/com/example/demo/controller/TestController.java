package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Project: spring
 * @author: liusw@rewin.com.cn
 * @Date: 2018/5/21 0021
 * @Copyright: 2018
 * @Version: V1.0
 * Description:
 */

@RestController
public class TestController {
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    RestTemplate restTemplate ;
    @RequestMapping(value = "/nihao",method = RequestMethod.GET)
    public String home(@RequestParam String name) {
//        http://localhost:8761/eureka/
        String greeting = this.restTemplate.getForObject("http://localhost:8761/greeting?name="+name, String.class);
        return greeting;
    }
    @RequestMapping(value = "/client1",method = RequestMethod.GET)
    public void testRestApi(){
        String str = restTemplate.getForObject("http:server1/server1Index", String.class);
        System.out.println(str);
    }
}
