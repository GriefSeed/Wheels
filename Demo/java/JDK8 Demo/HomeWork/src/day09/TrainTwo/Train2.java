package day09.TrainTwo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Train2 {
    public static void main(String[] args) {
        // 创建文件对象
        File dir = new File("e:/d1");
        // 获得该文件下的所有文件
        File[] files = dir.listFiles();
        // 创建目标文件
        File destDir = new File("e:/d2");
        // 遍历文件数组
        for (File file : files) {
            // 创建高效字节输入流对象
            try (FileInputStream fis = new FileInputStream(file);
                 FileOutputStream fos = new FileOutputStream(new File(destDir, file.getName()))
            ) {
                // 创建高效字节输出流对象
                // 定义字节数组接收读取的字节数
                byte[] buffer = new byte[2];
                // 定义变量接收实际读取的字节数
                int nextByte = -1;
                // 从输入流中循环读取数据
                while ((nextByte = fis.read(buffer)) != -1) {
                    // 利用输入流将数据写出到目标文件中
                    fos.write(buffer, 0, nextByte);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
