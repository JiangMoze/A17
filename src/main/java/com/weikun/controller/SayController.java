package com.weikun.controller;

import com.weikun.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/15.
 */
@Controller
@RequestMapping("/say")
@SessionAttributes({"myname","pwd"})
public class SayController {

    @RequestMapping("/ok")
    public String ok(@ModelAttribute User user,Map map){
        //Thymeleaf
        map.put("username",user.getUsername());
        return "ok";
    }
    @RequestMapping("/ok1")
    public @ModelAttribute("user1") User ok(@ModelAttribute("user1") User user,Model model){
        System.out.print(model.containsAttribute("user"));
        System.out.print(model.containsAttribute("user1"));
        return user;
    }


    @RequestMapping("/ok2")
    public @ModelAttribute List<String> ok2(){

        return Arrays.asList("A","B","C");
    }

    @RequestMapping("/ok3")
    public @ModelAttribute List<User> ok3(){

        return Arrays.asList(new User("weikun","119"),new User("json","991"));
    }

    @RequestMapping("/ok4")
    public @ModelAttribute Map<String,User> ok4(Model model){
        Map<String,User> map=new HashMap<String,User>();
        map.put("A",new User("weikun","119"));
        map.put("B",new User("json","222"));
        model.addAttribute("myname","哈尔滨");
        model.addAttribute("pwd","911");
        return map;
    }
}
