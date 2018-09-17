package day14.TrainOne;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Train5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个类的全类名,用.隔开:");
        String className = sc.nextLine();

        Class clazz = Class.forName("day14.TrainOne.A");

        Constructor<A> a = clazz.getDeclaredConstructor();
        a.setAccessible(true);
        A instance = a.newInstance();
        // 调用方法和构造方法，都要使用第三方
        Method printMethod = clazz.getMethod("showString");
        printMethod.invoke(instance);
    }
}

class A {
    public void showString() {
        System.out.println("一定要学好Java");
    }
}