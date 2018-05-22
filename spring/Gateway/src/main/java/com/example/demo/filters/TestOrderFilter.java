package com.example.demo.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Project: spring
 * @author: liusw@rewin.com.cn
 * @Date: 2018/5/22 0022
 * @Copyright: 2018
 * @Version: V1.0
 * Description:
 */

public class TestOrderFilter extends ZuulFilter {
    @Override
    public String filterType() {
        System.out.println("-------------------Filter2---pre-----------------");
        return "pre";
    }

    @Override
    public int filterOrder() {
        System.out.println("-------------------Filter2---filterOrder:2-----------------");
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        System.out.println("-------------------Filter2---shouldFilter:ture-----------------");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("-------------------Filter2---run-----------------");
        return null;
    }
}
