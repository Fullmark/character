package com.fullmark.character.contorller;

import com.fullmark.character.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanghuanbiao
 * 自定义属性
 */
@RestController
public class UserController {
    @Value("${com.user.name}")
    private String name;
    @Value("${com.user.want}")
    private String want;

    @Autowired
    private User user;

    @RequestMapping("/user")
    public String hexo(){
        return name+","+want;
    }

    @RequestMapping("/user2")
    public String hexo2(){
        return user.getName()+","+user.getWant();
    }
}
