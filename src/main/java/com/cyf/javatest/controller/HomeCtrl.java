package com.cyf.javatest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/home")
public class HomeCtrl {
    @RequestMapping("/index")
    @ResponseBody
    public Map index() {
        int i = 1 / 0;
        Map map = new HashMap();
        map.put("result", i);
        return map;
    }
}
