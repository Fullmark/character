package com.fullmark.character.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fanghuanbiao
 */
@Controller
public class IndexController {
    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/homeIndex")
    public String index(){
        return "homeIndex";
    }
}
