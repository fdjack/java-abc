package com.cn.zy.test_abc;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author: zhangyi
 * @date: 2018/12/10 13:43
 * @description:
 */
public class MyAQS extends AbstractQueuedSynchronizer {
    protected MyAQS() {
        super();
    }

    /**
     * 独占方式
     * 尝试获取资源，成功返回true 失败返回false
     *
     * @param arg
     * @return
     */
    @Override
    protected boolean tryAcquire(int arg) {
        return super.tryAcquire(arg);
    }

    /**
     * 尝试独占的方式，成功为true 失败为false
     *
     * @param arg
     * @return
     */
    @Override
    protected boolean tryRelease(int arg) {
        return super.tryRelease(arg);
    }

    /**
     * 共享方式
     * 尝试获取资源 负数表示失败 0 便是成功 但没有剩余可用资源；正数表示成功，且有剩余资源
     *
     * @param arg
     * @return
     */
    @Override
    protected int tryAcquireShared(int arg) {
        return super.tryAcquireShared(arg);
    }

    /**
     * 共享方式。尝试释放资源，成功则返回true，失败则返回false。
     *
     * @param arg
     * @return
     */
    @Override
    protected boolean tryReleaseShared(int arg) {
        return super.tryReleaseShared(arg);
    }

    /**
     * 该线程时候独占线程
     *
     * @return
     */
    @Override
    protected boolean isHeldExclusively() {
        return super.isHeldExclusively();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
