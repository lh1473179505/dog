package com.fhxy.websocket.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuhao
 * @create 2021-05-18 23:19
 */
@RestController
@RequestMapping("/api/jenkins")
public class JenKinsController {

    @GetMapping("getName")
    public String getName(){
        return "小白";
    }
}
