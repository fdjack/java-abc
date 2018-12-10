package lock.lock.fair;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: zhangyi
 * @date: 2018/12/9 23:17
 * @description:
 */
public class UnFairAndFairDemo {

    @Test
    public void fair() throws InterruptedException {
        //wait main execute over
//        CountDownLatch countDownLatch = new CountDownLatch(1);
        //structure multiple thread
        for(int i = 0; i < 10; i++){
            Integer count = i;
            new Thread(() -> {
                System.out.println("Thread index: "+count+" start run");
                new MyFairLock().fair();
                },"Thread index:"+i).start();
        }
//        countDownLatch.countDown();
//        countDownLatch.await();
    }
}
class MyFairLock {

    void fair(){
        //default is unfair lock
        // if add structure method paramter is true
        // so this is fair lock now
        ReentrantLock fairLock = new ReentrantLock(true);
        //this is unfair lock
//        ReentrantLock fairLock = new ReentrantLock(false);
        //add lock
        fairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" get lock");
        }catch (Exception e){
            System.out.println("Exception Happend");
        }finally {
            //here i must release lock
            fairLock.unlock();
            System.out.println(Thread.currentThread().getName() + "---free lock");
        }
    }
}
