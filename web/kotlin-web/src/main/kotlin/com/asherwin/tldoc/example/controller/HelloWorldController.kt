package com.asherwin.tldoc.example.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/hello")
class HelloWorldController {

  @RequestMapping("/world")
  fun world(): ResponseEntity<String> {
    return ResponseEntity.ok().body("hello world")
  }

}