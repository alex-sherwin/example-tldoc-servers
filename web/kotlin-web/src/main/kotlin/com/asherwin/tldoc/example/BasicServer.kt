package com.asherwin.tldoc.example

import com.asherwin.tldoc.example.controller.HelloWorldController
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class BasicServer {

  @Bean
  fun helloWorldController(): HelloWorldController = HelloWorldController()

}


fun main(args: Array<String>) {
  SpringApplication.run(BasicServer::class.java, *args)
}

