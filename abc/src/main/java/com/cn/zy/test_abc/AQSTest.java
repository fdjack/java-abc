package com.cn.zy.test_abc;

import org.junit.Test;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author: zhangyi
 * @date: 2018/12/10 13:41
 * @description:
 */
public class AQSTest {

    @Test
    public void aqs(){
        AbstractQueuedSynchronizer  aqs = new MyAQS();
    }
}
