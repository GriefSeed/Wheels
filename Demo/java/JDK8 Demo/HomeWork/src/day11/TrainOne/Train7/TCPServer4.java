package day11.TrainOne.Train7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TCPServer4 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);

        pool.execute(() -> {
            try {
                ServerSocket ss = new ServerSocket(9000);
                while (true) {
                    Socket accept = ss.accept();
                    BufferedInputStream input = new BufferedInputStream(accept.getInputStream());

                    byte[] mess = new byte[1024];
                    int len;
                    String fileName = System.currentTimeMillis() + new Random().nextInt(1000) + ".jpg";
                    BufferedOutputStream fileOutput = new BufferedOutputStream(new FileOutputStream(fileName));
                    while ((len = input.read(mess)) != -1) {
                        fileOutput.write(mess, 0, len);
                    }
                    fileOutput.close();
                    System.out.println("服务器收到图片：" + fileName);
                    BufferedOutputStream ourput = new BufferedOutputStream(accept.getOutputStream());
                    ourput.write("good!".getBytes());
                    ourput.flush();
                    accept.shutdownOutput();
                    accept.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                pool.shutdown();
            }
        });

    }
}
