package com.cn.zy.abc.thread.wait_notify;

import java.util.Queue;

/**
 * @author: zhangyi
 * @date: 2018/12/10 10:17
 * @description:
 */
public class Product extends Thread {

    private Integer maxCapacity;

    private Queue<Integer> productQueue;

    private Integer count = 0;

    public Product(Integer maxCapacity, Queue<Integer> productQueue) {
        this.maxCapacity = maxCapacity;
        this.productQueue = productQueue;
    }


    @Override
    public void run() {
//      使用的是自旋锁机制，在未获取到其资源的时候，会一直循环获取资源
        while (true) {
            //同步
            synchronized (productQueue) {
                try {
                    //生产者队列已经达到最大值，不再生成，将阻塞
                    while (productQueue.size() == maxCapacity) {
                        System.out.println("生产者队列已满");
                        productQueue.wait();
                    }
                    boolean offer = productQueue.offer(count++);
                    if(!offer) System.out.println("队列已满，无法添加元素");
                    System.out.println("队列正在生产："+productQueue.size()+" 个元素");
                    productQueue.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

