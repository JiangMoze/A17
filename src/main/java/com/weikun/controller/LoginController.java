package com.weikun.controller;

import com.weikun.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/15.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/add")
    public String add(Model model,
                      Map map,
                      ModelMap model3,User user){
        map.put("key",user.getUsername()+user.getPassword());


        return "success";
    }
    @RequestMapping("/del")
    public String del(Map map, @RequestParam("username") String username){

        map.put("key",username);
        return "success";
    }


    @RequestMapping("/login")
    public String login(Map map, @RequestParam("role") String []roles){
        map.put("key",roles[0]+roles[1]);
        return "success";
    }


    @RequestMapping("/login1")
    public String login1(Map map, @RequestParam("role") List<String> roles){
        map.put("key",roles.get(0)+roles.get(1));
        return "success";
    }
}
