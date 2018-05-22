package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
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
public class TestRestApiController {
    @RequestMapping(value = "/server1Index")
    public String server1Index(){
        return  "I am come from server1";
    }
}
