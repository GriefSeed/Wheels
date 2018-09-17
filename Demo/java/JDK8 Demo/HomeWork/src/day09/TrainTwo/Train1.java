package day09.TrainTwo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Train1 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("e:/test2.txt");) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生信息，格式：学号-姓名");
            while(true) {
                String line = sc.nextLine();
                // 判断输入的内容是否是end，是则终止循环
                if(line.equals("end")){
                    System.out.println("保存成功");
                    break;
                }
                fos.write(line.getBytes());
                fos.write(System.lineSeparator().getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
