package com.example.demo.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Project: spring
 * @author: liusw@rewin.com.cn
 * @Date: 2018/5/22 0022
 * @Copyright: 2018
 * @Version: V1.0
 * Description:关注过滤器的生命周期和各个方法的执行顺序
 */

public class SimpleFilter extends ZuulFilter{
    private static Logger log = LoggerFactory.getLogger(SimpleFilter.class);

    /**
     * 返回一个标准的过滤器类型, 本例为pre
     * returns a String that stands for the type of the filter---in this case, pre, or it could be route for a routing filter.
     * pre filters are executed before the request is routed,  //在run方法执行前执行
     * route filters can handle the actual routing of the request,
     * post filters are executed after the request has been routed, and
     * error filters execute if an error occurs in the course of handling the request.
     * 四种过滤类型如下：
     *  pre：这种过滤器在请求被路由之前调用。我们可利用这种过滤器实现身份验证、在集群中选择请求的微服务、记录调试信息等。
     * route：这种过滤器将请求路由到微服务。这种过滤器用于构建发送给微服务的请求，并使用Apache HttpClient或Netfilx Ribbon请求微服务。
     * post：这种过滤器在路由到微服务以后执行。这种过滤器可用来为响应添加标准的HTTP Header、收集统计信息和指标、将响应从微服务发送给客户端等。
     * error：在其他阶段发生错误时执行该过滤器。
     * @return
     */
    @Override
    public String filterType() {
        System.err.println("-------------------filter1 filterType:pre --------------------");
        return "pre";
    }

    /**
     * 返回一个int值来指定过滤器的执行顺序，不同的过滤器允许返回相同的数字
     * 有多个过滤器时才有效，返回值越大，filterType和filterOrder方法越早执行，但是shouldFilter和run方法越晚执行
     * gives the order in which this filter will be executed, relative to other filters.
     * @return
     */
    @Override
    public int filterOrder() {
        System.err.println("-------------------filter1 filterOrder:1--------------------");
        return 1;
    }

    /**
     * 是否改进行过滤，若为true ，则会对请求进行过滤 ，将执行下面的run()方法
     * contains the logic that determines when to execute this filter (this particular filter will always be executed).
     * @return
     */
    @Override
    public boolean shouldFilter() {
        System.err.println("-----------------filter--shouldFilter:true--------------------");
        return true;
    }

    /**
     * 处理相应的过滤逻辑
     * contains the functionality of the filter.
     * @return
     */
    @Override
    public Object run() {
        System.err.println("-------------------filter1------run()--------------------");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
//        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        return null;
    }
}
