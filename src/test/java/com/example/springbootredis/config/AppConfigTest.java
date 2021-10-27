package com.example.springbootredis.config;

import com.example.springbootredis.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;


@SpringBootTest
class AppConfigTest {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void test() {
        ValueOperations<String,Object> vop = redisTemplate.opsForValue();

        Member user = new Member();
        user.setEmail("etst@d.com");
        user.setName("홍길동");

        vop.set("testkey",user);

        Member member = (Member) vop.get("testkey");

        System.out.println(member.getEmail());
    }

}