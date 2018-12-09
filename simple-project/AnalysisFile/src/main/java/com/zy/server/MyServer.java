package com.zy.server;

import com.zy.domain.FileEntity;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * 服务器端接收客户端的消息
 *
 * @author zhangyi
 * @date 2018-7-19 17:02
 */
public class MyServer implements Runnable{
        Socket socket = null;
        public MyServer(Socket socket){
            this.socket = socket;
        }
        public void run() {
            ObjectInputStream objectInputStream = null;
            try {
                objectInputStream = new ObjectInputStream(socket.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
            while (true) {
                FileEntity fileEntity=null;
                try {
                    fileEntity = (FileEntity)objectInputStream.readObject();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("获取对象： "+fileEntity);
                if (fileEntity.getEndFlag().equals("exit")) {
                    break;
                }
            }
            try {
                objectInputStream.close();
                socket.shutdownInput();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
