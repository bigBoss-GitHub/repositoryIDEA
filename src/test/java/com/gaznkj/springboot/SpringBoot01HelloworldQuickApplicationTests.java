package com.gaznkj.springboot;

import com.gaznkj.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringBoot01HelloworldQuickApplicationTests {
    @Autowired
    Person person;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    void testRedis(){
        stringRedisTemplate.opsForValue().append("msg2","hello2");
    }

    @Test
    void contextLoads() {
        System.out.println(person.getLastName());
        logger.trace("跟踪");

    }

}
