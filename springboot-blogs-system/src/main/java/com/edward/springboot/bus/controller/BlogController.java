package com.edward.springboot.bus.controller;

import com.edward.springboot.bus.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class BlogController {
    @Autowired
    private BlogService blogService;
}
