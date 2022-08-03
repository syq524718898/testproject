package com.sunyuqi.config;


import com.sunyuqi.handler.HttpHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class HandlerInterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry)
    {
        interceptorRegistry.addInterceptor(new HttpHandler()).addPathPatterns("/**");
    }
}
