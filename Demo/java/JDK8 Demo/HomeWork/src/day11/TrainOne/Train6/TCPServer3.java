package day11.TrainOne.Train6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer3 {
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
                ourput.write("good!".getBytes());
                ourput.flush();
                accept.shutdownOutput();
                accept.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
