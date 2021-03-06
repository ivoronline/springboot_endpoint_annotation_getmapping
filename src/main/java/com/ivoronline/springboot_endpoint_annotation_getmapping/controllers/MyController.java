package com.ivoronline.springboot_endpoint_annotation_getmapping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @GetMapping("/Hello")
  public String hello() {
    return "Hello from Controller";
  }

}
