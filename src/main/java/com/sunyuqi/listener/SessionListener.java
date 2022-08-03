package com.sunyuqi.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("seesion初始化");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("seesion销毁");
    }
}
