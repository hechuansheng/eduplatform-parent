package com.sjy.eduplatform.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author : hechuansheng
 * @date : 2023/8/16 15:12
 * @since : version-1.0
 */
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }

}
