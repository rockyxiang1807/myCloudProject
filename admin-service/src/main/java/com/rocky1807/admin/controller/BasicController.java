package com.rocky1807.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * wenhui.xiang
 * 2023/09/12 6:28 下午
 */


@RestController
@Slf4j
public class BasicController {

    @GetMapping("/first")
    public String first(){
        log.info("============= Begin. ");
        return "============= Admin!!!";
    }
}
