package com.ssungis.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Api("user Test API")
@RequestMapping(path="/api/v1/test")
@RestController
public class TestController {

    @GetMapping("")
    @ApiOperation(value = "user Test API")
    public String getTest(){
        return "user";
    }
}
