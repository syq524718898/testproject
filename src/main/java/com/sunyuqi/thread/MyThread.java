package com.sunyuqi.thread;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyThread {

    public static void init() {
        new Thread(()->{
            while (true)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.println(format.format(Calendar.getInstance().getTime()));
            }
        }).start();
    }
}
