package day12.Train3;

import java.net.InetAddress;

public class Train3 {
    public static void main(String[] args) {
        decToHex(12, Integer::toHexString);
    }

    private static void decToHex(int num, NumberConversion nc) {
        System.out.println(nc.convert(num));
    }
}
