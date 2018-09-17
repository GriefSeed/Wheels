package day11.TrainOne.Train5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClient2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 9000);
            BufferedOutputStream fop = new BufferedOutputStream(socket.getOutputStream());
            fop.write("hello.服务器,我是客户端".getBytes());
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
