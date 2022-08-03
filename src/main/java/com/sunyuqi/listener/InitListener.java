package com.sunyuqi.listener;

import com.sunyuqi.thread.MyThread;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.concurrent.ConcurrentHashMap;

@WebListener
public class InitListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
//        MyThread.init();
    }


    public void contextDestroyed(ServletContextEvent sce) {
    }
}
