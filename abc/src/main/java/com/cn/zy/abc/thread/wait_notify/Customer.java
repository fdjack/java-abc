package com.cn.zy.abc.thread.wait_notify;

import java.util.Objects;
import java.util.Queue;

/**
 * @author: zhangyi
 * @date: 2018/12/10 10:17
 * @description:
 */
public class Customer extends Thread {
    private Integer maxCapacity;

    private Queue<Integer> customerQueue;

    public Customer(Integer maxCapacity,Queue<Integer> customerQueue){
        this.maxCapacity = maxCapacity;
        this.customerQueue = customerQueue;
    }

    @Override
    public void run() {
        try {
            //同时，也是使用自旋锁
            while (true) {
                synchronized (customerQueue) {
                    while (customerQueue.isEmpty()) {
                        System.out.println("消费者已经消费完了");
                        customerQueue.wait();
                    }
                    Integer poll = customerQueue.poll();
                    if(Objects.isNull(poll)) {
                        System.out.println("无元素，无法移除元素");
                    }else{
                        System.out.println("移除成功！！！");
                    }
                    System.out.println("此时队列中剩余个数是："+customerQueue.size());
                    customerQueue.notifyAll();
                }
            }
        }catch (Exception e){

        }finally {

        }
    }
}
