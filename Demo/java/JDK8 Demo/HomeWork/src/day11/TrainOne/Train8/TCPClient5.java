package day11.TrainOne.Train8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient5 {
    public static void main(String[] args) {
        try {
            Socket socket;
            Scanner in = new Scanner(System.in);
            BufferedOutputStream fop;
            BufferedInputStream receive;
            while (true) {
                String nameAndPass = in.nextLine();
                if ("exit".equals(nameAndPass.trim().toString())) {
                    break;
                }
                socket = new Socket(InetAddress.getLocalHost(), 9000);
                fop = new BufferedOutputStream(socket.getOutputStream());

                // 读文件流

                fop.write(nameAndPass.trim().toString().getBytes());
                fop.flush();
                // 一定要通知服务器，写入已停止
                socket.shutdownOutput();

                receive = new BufferedInputStream(socket.getInputStream());
                byte[] mess = new byte[1024];
                receive.read(mess);
                System.out.println(new String(mess));
                fop.close();
                receive.close();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
