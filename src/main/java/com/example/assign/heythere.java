package com.example.assign;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class heythere
{
    @RequestMapping("/get")
    public String ap1()
    {
        return "hi there";
    }
}
