package com.fourdkelvin.framework.controller;

import com.fourdkelvin.framework.service.InvoiceService;
import com.fourdkelvin.framework.utils.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "HomeController", description = "首页")
@RestController
@RequestMapping(value = "/")
public class HomeController {
    @Autowired
    InvoiceService invoiceService;

    @ApiOperation(value = "首页")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public CommonResult index() {
        return CommonResult.success(invoiceService.findById("00000214f0414709852d7a97033df6e6"));
    }
}
