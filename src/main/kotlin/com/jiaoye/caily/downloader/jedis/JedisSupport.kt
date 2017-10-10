package com.jiaoye.caily.downloader.jedis

import redis.clients.jedis.Jedis

/**
 *
 * Created by Intellij IDEA
 * Copyright (c) CailyPersonal
 * Version: v1.0
 * Author: Caily
 * Date: 10/10/2017
 */


class JedisSupport {

    var jedis : Jedis = Jedis("localhost")


    public fun set(key : String, value : String) {
        jedis.set(key, value)
    }

    public fun setWithTimeout(key : String, timeout : Int, value : String) {
        jedis.psetex(key, timeout, value)
    }

}