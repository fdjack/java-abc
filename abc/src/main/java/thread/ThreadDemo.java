package thread;

import java.util.List;

/**
 * @author: zhangyi
 * @date: 2018/12/10 09:32
 * @description:
 */
public class ThreadDemo {

    public static void main(String[] args) {

    }

}


class Product{

    private List<Integer> count;

    public Product(List<Integer> count) {
        this.count = count;
    }

    public void p(){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {

        }
    }
}

class Consumer{

    private List<Integer> count;

    public Consumer(List<Integer> count) {
        this.count = count;
    }

    public void c(){

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {

        }
    }
}