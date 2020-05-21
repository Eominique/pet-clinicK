package com.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController {

@GetMapping("/")
fun welcome():String{
    return "Welcome from Pet clinic"
}


}