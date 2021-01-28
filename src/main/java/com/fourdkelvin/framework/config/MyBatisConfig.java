package com.fourdkelvin.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *  MyBatis配置类
 *  @author: JameWen
 *  @version: V1.0
 *  @Description
 *  @Date 2020/6/5
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.fourdkelvin.framework.mapper"})
public class MyBatisConfig {
}
