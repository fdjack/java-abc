package com.zy.client;

import com.zy.domain.FileEntity;

import java.io.ObjectOutputStream;

public class MyClient implements Runnable {
    FileEntity fileEntity = null;
    public MyClient(Object o){

        this.fileEntity = (FileEntity) o;
    }
    public void run() {
        ObjectOutputStream objectOutputStream = null;
        while(true) {
            try {
                objectOutputStream.writeObject(fileEntity);
                System.out.println("∑¢ÀÕ∂‘œÛ£∫ ----"+fileEntity.toString());
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
