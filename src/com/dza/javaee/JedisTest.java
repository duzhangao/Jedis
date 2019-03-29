package com.dza.javaee;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisTest {
    public static void main(String[] args) {
        JedisPool jedisPool=new JedisPool();
        Jedis jedis=jedisPool.getResource();
        jedis.set("hehe","haha");
        jedis.close();
    }
}
