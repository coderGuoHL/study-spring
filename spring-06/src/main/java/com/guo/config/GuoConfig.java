package com.guo.config;

import com.guo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//configuration表示这是一个配置类，就像之前的xml文件
@Configuration
public class GuoConfig {
    //注册一个bean，相当于我们之前xml文件中的一个bean标签
    // 方法名---bean标签中的id属性
    // 方法返回值---bean标签中的class属性
    //
    @Bean
    public User getUser() {
        return new User();
    }
    
}
