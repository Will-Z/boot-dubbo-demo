package com.zmxy.serviceprovider.service.impl;

import com.zmxy.api.service.Calc;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author will
 * @date 2019/12/30
 */
@Service(version="1.0.0")
@Component
public class CalcImpl implements Calc {
    @Override
    public int square(int num) {
        System.out.println("[service] square receive  " + num);
        return num * num;
    }

    @Override
    public int doubl(int num) {
        System.out.println("[service] doubl receive   " + num);
        return num << 1;
    }
}
