package com.taotao.order.dao;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 19:22 2018/2/27
 */
public interface JedisClient {

        String get(String key);
        String set(String key, String value);
        String hget(String hkey, String key);
        long hset(String hkey, String key, String value);
        long incr(String key);
        long expire(String key, int second);
        long ttl(String key);
        long del(String key);
        long hdel(String hkey, String key);

}
