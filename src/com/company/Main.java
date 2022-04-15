package com.company;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            Socket client = new Socket("127.0.0.1", 3000);
            OutputStream outputStream = client.getOutputStream();
            DataOutputStream dataOutput = new DataOutputStream(outputStream);
            dataOutput.writeUTF("Hello from the Client Side");
            dataOutput.close();
            client.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
