package com.weikun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/11/15.
 */
@Controller
@RequestMapping("/cookie")
public class CookieController {
    @RequestMapping("/ok/{username}")
    public String ok(@PathVariable("username") String username,
                     @CookieValue("JSESSIONID") Cookie cookie,
                     HttpServletResponse response){
        Cookie c=new Cookie("myname",username);// 自己写的cookie

        cookie.setValue(username);//利用它本身键
        response.addCookie(c);
        response.addCookie(cookie);
        return "cookie";
    }
}
