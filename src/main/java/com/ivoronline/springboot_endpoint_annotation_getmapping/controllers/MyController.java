package com.ivoronline.springboot_endpoint_annotation_getmapping.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Start")             //URLs of all Endpoints start with this prefix
public class MyController {

  //================================================================
  // HELLO
  //================================================================
  @GetMapping("Hello")
  String hello() {
    return "Hello from Controller";
  }

}
