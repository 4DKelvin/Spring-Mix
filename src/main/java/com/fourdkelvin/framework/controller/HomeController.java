package com.fourdkelvin.framework.controller;

import com.fourdkelvin.framework.utils.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "HomeController", description = "首页")
@RestController
@RequestMapping(value = "/")
public class HomeController {
    @ApiOperation(value = "首页")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public CommonResult index() {
        return CommonResult.success(null);
    }
}
