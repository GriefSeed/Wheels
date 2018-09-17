package day11.TrainOne.Train8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TCPServer5 {
    public static void main(String[] args) {
        Properties userList = new Properties();

        ExecutorService pool = Executors.newFixedThreadPool(10);

        pool.execute(() -> {
            try {
                // 载入用户账号密码文件
                BufferedReader bfr = new BufferedReader(new FileReader("user.txt"));
                userList.load(bfr);

                ServerSocket ss = new ServerSocket(9000);
                while (true) {
                    Socket accept = ss.accept();
                    BufferedInputStream input = new BufferedInputStream(accept.getInputStream());

                    byte[] messBox = new byte[1024];

                    int len = input.read(messBox);

                    String[] nameAndPass = new String(messBox, 0, len).split("=");
                    BufferedOutputStream ourput = new BufferedOutputStream(accept.getOutputStream());
                    if (userList.getProperty(nameAndPass[0].toString()) != null && userList.getProperty(nameAndPass[0].toString()).equals(nameAndPass[1].toString())) {
                        ourput.write("登陆成功!".getBytes());
                    } else {
                        ourput.write("sb，账号密码错误，滚!".getBytes());
                    }

                    // System.out.println("服务器收到图片：" + fileName);
                    ourput.flush();
                    accept.shutdownOutput();
                    accept.close();
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}



