package com.cyf.javatest.controller;

import com.cyf.javatest.suit.response.R;
import com.cyf.javatest.suit.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/api")
public class ApiCtrl {

    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/index")
    @ResponseBody
    public Result index() {
        return R.success("ok", "api");
    }
}
