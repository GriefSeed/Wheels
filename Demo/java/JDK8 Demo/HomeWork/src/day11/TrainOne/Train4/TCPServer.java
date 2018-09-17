package day11.TrainOne.Train4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9000);
            while (true) {
                Socket accept = ss.accept();
                BufferedInputStream input = new BufferedInputStream(accept.getInputStream());

                byte[] mess = new byte[1024];
                int len;
                while ((len = input.read(mess)) != -1) {
                    System.out.println(new String(mess, 0, len));
                }
                BufferedOutputStream ourput = new BufferedOutputStream(accept.getOutputStream());
                ourput.write("收到!".getBytes());
                ourput.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
