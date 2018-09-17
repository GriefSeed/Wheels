package day11.TrainOne.Train3;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        // 不能用字符串的长度
        byte[] message = "hello~, 你TMhhhhhhdgrrhhhhhhhhhhhhhhhhhhhf????".getBytes();
        try {
            DatagramPacket packet = new DatagramPacket(message, message.length, InetAddress.getByName("127.0.0.1"), 9000);
            DatagramSocket datagramSocket = new DatagramSocket();

            datagramSocket.send(packet);
            datagramSocket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
