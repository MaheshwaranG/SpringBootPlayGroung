package com.maheshgo.demo.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author manoj.bardhan
 *
 */
@Controller
@EnableAutoConfiguration
public class HelloWorldController {
@RequestMapping("/hello")
@ResponseBody
public String sayHello() {
return "Hello World Developer!!!";
}

@RequestMapping(value = "/uploader", method = RequestMethod.GET)
public String UploaderPage(ModelMap model){
    return "file-uploader";
} 
}