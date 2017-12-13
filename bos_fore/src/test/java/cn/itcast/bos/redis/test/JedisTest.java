package cn.itcast.bos.redis.test;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {
	@Test
	public void testRedis() {
		// 连接localhost 默认端口 6379
		Jedis jedis = new Jedis("localhost");

		jedis.setex("company", 30, "黑马程序员");

		System.out.println(jedis.get("company"));
	}
}
