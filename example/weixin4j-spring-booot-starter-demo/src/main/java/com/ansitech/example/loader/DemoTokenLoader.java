package com.ansitech.example.loader;

import org.springframework.stereotype.Component;
import org.weixin4j.loader.ITokenLoader;
import org.weixin4j.model.base.Token;

/**
 * DemoTokenLoader
 *
 * @author yangqisheng
 * @date 2023/6/5 22:11
 */
@Component
public class DemoTokenLoader implements ITokenLoader {

    private Token token;

    @Override
    public Token get() {
        if (null != token && token.isExprexpired()) {
            return null;
        }
        return token;
    }

    @Override
    public void refresh(Token token) {
        this.token = token;
    }
}