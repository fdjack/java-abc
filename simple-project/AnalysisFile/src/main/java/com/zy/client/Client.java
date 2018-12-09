package com.zy.client;

import com.zy.domain.FileEntity;
import com.zy.util.FileUtil;
import com.zy.util.PropertiesUtil;

import java.net.Socket;

/**
 * 客户端
 */
public class Client {
    String fileName = "";
    public Client(String fileName){
        this.fileName = fileName;
    }
    /**
     * 获取文件映射对象
     */
    FileEntity fileObject = FileUtil.getFileObject(fileName);
    public void send() throws Exception {
        System.out.println("客户端启动...");
        //获取ip地址和端口号
        PropertiesUtil properties = new PropertiesUtil();
        String ip = properties.getValue("ip");
        String port = properties.getValue("port");
        Socket socket = new Socket(ip,Integer.parseInt(port));
        while(true){
            new Thread(new MyClient(fileObject)).start();
        }
    }
}
