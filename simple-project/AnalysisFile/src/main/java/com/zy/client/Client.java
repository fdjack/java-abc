package com.zy.client;

import com.zy.domain.FileEntity;
import com.zy.util.FileUtil;
import com.zy.util.PropertiesUtil;

import java.net.Socket;

/**
 * �ͻ���
 */
public class Client {
    String fileName = "";
    public Client(String fileName){
        this.fileName = fileName;
    }
    /**
     * ��ȡ�ļ�ӳ�����
     */
    FileEntity fileObject = FileUtil.getFileObject(fileName);
    public void send() throws Exception {
        System.out.println("�ͻ�������...");
        //��ȡip��ַ�Ͷ˿ں�
        PropertiesUtil properties = new PropertiesUtil();
        String ip = properties.getValue("ip");
        String port = properties.getValue("port");
        Socket socket = new Socket(ip,Integer.parseInt(port));
        while(true){
            new Thread(new MyClient(fileObject)).start();
        }
    }
}
