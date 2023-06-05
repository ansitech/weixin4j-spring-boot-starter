package com.ansitech.example.loader;

import org.springframework.stereotype.Component;
import org.weixin4j.pay.loader.IRsaPubKeyLoader;
import org.weixin4j.pay.model.rsa.RsaXml;

/**
 * DemoRsaLoader
 *
 * @author yangqisheng
 * @date 2023/6/5 22:12
 */
@Component
public class DemoRsaLoader implements IRsaPubKeyLoader {
    private String pub_key;

    @Override
    public String get() {
        return pub_key;
    }

    @Override
    public void refresh(RsaXml rsaXml) {
        this.pub_key = rsaXml.getPub_key();
    }
}
