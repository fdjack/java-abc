package com.cn.zy.abc.thread.yield;

import org.junit.Test;

/**
 * @author: zhangyi
 * @date: 2018/12/10 14:14
 * @description:
 */
public class PCDemo {

    private Integer MAX_SIZE = 5;

    @Test
    public void pc(){
        Product product = new Product(MAX_SIZE);
        Customer customer = new Customer(MAX_SIZE);

        customer.setPriority(Thread.MAX_PRIORITY);
        product.setPriority(Thread.MIN_PRIORITY);

        product.start();
        customer.start();

    }

}
class Product extends Thread{

    private Integer size;
    public Product(Integer size){
        this.size = size;
    }


    @Override
    public void run() {
        for (int i = 0; i < size; i++){
            System.out.println("已生产："+i);
//            Thread.yield();
        }
    }

}
class Customer extends Thread{
    private Integer size;
    public Customer(Integer size){
        this.size = size;
    }

    @Override
    public void run() {
        for (int i = 0; i < size; i++) {
            System.out.println("消费者：" + i);
//            Thread.yield();
        }
    }
}