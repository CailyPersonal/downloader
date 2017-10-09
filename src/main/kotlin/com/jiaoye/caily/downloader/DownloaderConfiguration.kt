package com.jiaoye.caily.downloader

import com.jiaoye.caily.downloader.interceptor.LoginInterceptor
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter


@EnableWebMvc
@EnableAutoConfiguration
@Configuration
class DownloaderConfiguration : WebMvcConfigurerAdapter() {

    override fun addInterceptors(registry: InterceptorRegistry?) {
        registry!!.addInterceptor(LoginInterceptor())
    }

}
