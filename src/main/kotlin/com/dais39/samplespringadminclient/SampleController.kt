package com.dais39.samplespringadminclient

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/")
    fun sayHello(): String{
        return "Hello"
    }
}
