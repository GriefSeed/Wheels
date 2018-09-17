package day11.TrainOne.Train4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 9000);
            BufferedOutputStream fop = new BufferedOutputStream(socket.getOutputStream());
            fop.write("fuck your server ass!".getBytes());
            fop.flush();
            // 一定要通知服务器，写入已停止
            socket.shutdownOutput();

            BufferedInputStream receive = new BufferedInputStream(socket.getInputStream());
            byte[] mess = new byte[1024];
            receive.read(mess);
            System.out.println(new String(mess));
            fop.close();
            receive.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
