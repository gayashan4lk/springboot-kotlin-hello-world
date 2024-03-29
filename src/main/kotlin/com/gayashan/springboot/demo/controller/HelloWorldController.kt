package com.gayashan.springboot.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello-world")
class HelloWorldController {
    @GetMapping
    fun helloWorld(): String = "Hello, Spring Boot!"
}