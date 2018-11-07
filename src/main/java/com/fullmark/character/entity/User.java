package com.fullmark.character.entity;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author fanghuanbiao
 * 自定义配置文件与参数间引用
 */
@Component
@ConfigurationProperties(prefix="com.md")
@PropertySource("classpath:config/user.properties")
public class User {

    private String name;
    private String want;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }


}
