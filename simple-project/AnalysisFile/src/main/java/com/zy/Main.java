package com.zy;

import com.zy.client.Client;

public class Main {
    public static void main(String[] args) throws Exception {
        new Client("C_PCB-13M045001100-V4.1_20180615082909.log").send();
    }
}
