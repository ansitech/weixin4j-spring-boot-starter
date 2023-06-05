package com.ansitech.example.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.weixin4j.WeixinException;
import org.weixin4j.model.base.Token;
import org.weixin4j.spring.WeixinTemplate;

/**
 * IndexController
 *
 * @author yangqisheng
 * @date 2023/6/5 22:02
 */
@AllArgsConstructor
@RestController
public class IndexController {

    private WeixinTemplate weixinTemplate;

    @GetMapping("/token.get")
    public Token getToken() throws WeixinException {
        return weixinTemplate.getToken();
    }
}
