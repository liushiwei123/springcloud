package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
public class GreetingController {
    @RequestMapping(value = "greeting")
    public String greeting(@RequestParam(value="name", defaultValue="Artaban") String name){
        return  "hello "+name+",my port is  8761";
    }
}
