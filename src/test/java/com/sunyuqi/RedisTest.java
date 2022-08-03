package com.sunyuqi;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.concurrent.TimeUnit;


@SpringBootTest(classes = SpringApplicatioMain.class)
@RunWith(SpringRunner.class)
@Slf4j
public class RedisTest {
    @Autowired
    private JedisPool jedisPool;

//    @Autowired
//    private RedissonClient redissonClient;

    private String lockkey="lockkey";

//    @Test
//    public void tryLock() throws Exception {
//        RLock lock = redissonClient.getLock(lockkey);
//        boolean b = lock.tryLock();
//        if(b)
//        {
//            System.out.println("我抢到锁啦");
//            lock.unlock();
//        }
//        redissonClient.shutdown();
//    }

    @Test
    public void addItem()
    {

        Jedis jedis = jedisPool.getResource();
        for (int i = 1000; i > 0; i--) {
            jedis.rpush("test_list",""+i);
        }
        jedis.close();
    }

    @Test
    public void testSetAndGet(){
        log.info("测试开始");
        log.info("测试set");
        Jedis jedis = jedisPool.getResource();
        jedis.set("测试key","测试value");
        jedis.expire("测试key",5);
        log.info("测试get");
        String key = jedis.get("测试key");
        log.info("key的value: {}",key);

    }
}
