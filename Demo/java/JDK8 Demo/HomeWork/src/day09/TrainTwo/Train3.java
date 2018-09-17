package day09.TrainTwo;

import java.io.FileInputStream;
import java.io.IOException;

public class Train3 {
    public static void main(String[] args) {
        char ch = 'a';
        try(FileInputStream fis = new FileInputStream("e:/test3.txt")) {
            int count = 0;
            int len = -1;
            while ((len = fis.read()) != -1) {
                // 将读取的字节转换成字符
                char c = (char) len;
                // 判断字符c和外界传入的字符是否相同
                if (c == ch) {
                    count ++;
                }
            }
            System.out.println(ch+"出现了" + count +"次");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
