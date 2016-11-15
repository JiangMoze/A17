package com.weikun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/15.
 */

@Controller//他是个控制器
@RequestMapping("/hello1")
public class HelloController {
//    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//        ModelAndView mv=new ModelAndView();
//        mv.setViewName("success");
//        mv.addObject("key","哈尔滨");
//        return mv;
//    }
    @RequestMapping(value = "/ok",method = {RequestMethod.GET,RequestMethod.POST})
    public String ok(Map map){
        map.put("key","哈尔滨");
        return "success";
    }
    @RequestMapping(value="/add/username/{name}")
    public String add(Map map,
                      @PathVariable(value="name") String username){
        map.put("key",username+"你好");
        return "success";
    }
    @RequestMapping(value="/del/price/{max:\\d+}-{min:\\d+}")
    public String del(Map map,
                      @PathVariable(value="max") int max,
                      @PathVariable(value="min") int min){


        map.put("key",""+max+"--"+min+"你好");
        return "success";
    }


}
