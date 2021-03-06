package com.so.lateinit

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @Autowired
    lateinit var service: Service

    @RequestMapping("/doStuff")
    fun doStuff() = service.doStuff()
}