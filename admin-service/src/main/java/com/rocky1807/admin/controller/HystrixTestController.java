package com.rocky1807.admin.controller;

import com.rocky1807.admin.api.FeatureHystrixTestService;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * wenhui.xiang
 * 2023/09/11 6:09 下午
 */

@RestController
@RequestMapping("/hystrix")
public class HystrixTestController {

    @Autowired
    private FeatureHystrixTestService featureHystrixTestService;

    @GetMapping("/t")
    public String getHystrix(@Param("str") String str) {
        return featureHystrixTestService.hystrixTest(str);
    }
}
