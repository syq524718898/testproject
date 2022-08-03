package com.sunyuqi.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(initParams = {@WebInitParam(name = "myfilter",value = "/**")})
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("过滤器前。。。");
        filterChain.doFilter(servletRequest,servletResponse);
//        System.out.println("过滤器后。。。。");
    }

    @Override
    public void destroy() {
//        System.out.println("过滤器销毁");
    }
}
