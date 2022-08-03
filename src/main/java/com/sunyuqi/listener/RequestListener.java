package com.sunyuqi.listener;

import org.springframework.web.context.request.RequestContextListener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {
    public void requestDestroyed(ServletRequestEvent sre) {
//        System.out.println("请求销毁");
    }

    public void requestInitialized(ServletRequestEvent sre) {
//        System.out.println("请求初始化");
    }
}
