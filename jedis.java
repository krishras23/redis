package org.example;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import java.util.HashMap;

public class TestRed {
    public static void main(String[] args) {
        JedisPool pool = new JedisPool("localhost", 6380);
        try (Jedis jedis = pool.getResource()) {
            jedis.set("foo", "bar");
            System.out.println(jedis.get("foo")); // Prints: bar

            HashMap<String, String> chuck = new HashMap<>();
            chuck.put("name", "John");
            chuck.put("surname", "Smith");
            chuck.put("company", "Redis");
            chuck.put("age", "29");

            jedis.hmset("user:chuck", chuck);
            HashMap<String, String> retrievedChuck = (HashMap<String, String>) jedis.hgetAll("user:chuck");
            System.out.println(retrievedChuck);
        }
    }
}
