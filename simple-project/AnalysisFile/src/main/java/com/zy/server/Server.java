package com.zy.server;

import com.zy.util.PropertiesUtil;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * ��������
 */
public class Server {


    public void server() throws Exception {
        PropertiesUtil propertiesUtil = new PropertiesUtil();
        String port = propertiesUtil.getValue("port");
        ServerSocket serverSocket = new ServerSocket(Integer.parseInt(port));
        System.out.println("���������Ѿ�����...");
        int count = 0;
        while(true){
            Socket accept = serverSocket.accept();
            new Thread(new MyServer(accept)).start();
            count++;
            System.out.println("��"+count+"���ͻ����ӽ����ˣ�");
        }
    }
}
