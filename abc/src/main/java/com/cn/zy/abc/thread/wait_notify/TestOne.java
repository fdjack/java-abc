package com.cn.zy.abc.thread.wait_notify;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: zhangyi
 * @date: 2018/12/10 10:38
 * @description:
 */
public class TestOne {

    private static Integer maxCapacity = 10;

    private static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("生产队列最大是："+maxCapacity);
        for(;;){
            Product product = new Product(maxCapacity, queue);
            product.start();
            Customer customer = new Customer(maxCapacity,queue);
            customer.start();
        }
    }
}
