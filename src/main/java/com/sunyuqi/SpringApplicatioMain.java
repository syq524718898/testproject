package com.sunyuqi;

import com.sunyuqi.listener.InitListener;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.StringCodec;
import org.redisson.config.Config;
import org.redisson.config.TransportMode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import tk.mybatis.spring.annotation.MapperScan;

import javax.servlet.Servlet;


@SpringBootApplication
@MapperScan("com.sunyuqi.dao")
@ServletComponentScan
@EnableAspectJAutoProxy
public class SpringApplicatioMain {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicatioMain.class,args);
    }
//    @Bean
//    public ServletListenerRegistrationBean servletRegistrationBean()
//    {
//        ServletListenerRegistrationBean register = new ServletListenerRegistrationBean();
//        register.setListener(new InitListener());
//        return register;
//    }
    @Bean
    public JedisPool registJedisPool() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(5);
        config.setMaxTotal(100);
        config.setMaxWaitMillis(1000);
        return new JedisPool(config, "127.0.0.1", 6379);
    }

//    @Bean
//    public RedissonClient redissonClient()
//    {
//
//        Config config = new Config();
//        // 传输模式既可以设置为EPOLL，也可以设置为NIO等
//        config.setTransportMode(TransportMode.NIO);
//        config.useSingleServer()
//                .setAddress("redis://127.0.0.1:6379")
//                .setKeepAlive(true);
//        config.setCodec(new StringCodec());
//        return Redisson.create(config);
//    }

}
