package day11.TrainOne.Train3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) {
        byte[] receiveMess = new byte[1024];
        while (true) {
            DatagramPacket receivePage = new DatagramPacket(receiveMess, receiveMess.length);

            try (DatagramSocket dp = new DatagramSocket(9000)) {
                dp.receive(receivePage);
                System.out.println("Client IP is :" + receivePage.getAddress().toString() + ":" + receivePage.getPort());
                int len = receivePage.getLength();
                System.out.println(new String(receiveMess, 0, len));

            } catch (SocketException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
