package com.nana.common.mybatis;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: GUOYUJUN
 * @time: 2019/12/31 17:08
 * @description:
 */
@Configuration
@MapperScan("com.nana.modules.**.dao")
public class MybatisPlusConfig {

    /**
     * 分页插件
     * @return PaginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
