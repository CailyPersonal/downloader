package com.jiaoye.caily.downloader.redis

import redis.clients.jedis.Jedis

class JedisSupport {

    internal var jedis: Jedis = Jedis()

    fun setValue(key: String, value: String) {
        jedis.set(key, value)
    }

    fun setValueWithTimeout(key: String, value: String, timeout: Int) {
        jedis.psetex(key, timeout, value)
    }

    fun getValue(key: String) = jedis.get(key)

}