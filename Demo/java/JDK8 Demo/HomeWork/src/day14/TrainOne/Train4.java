package day14.TrainOne;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Train4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class cls = Class.forName("day14.TrainOne.Demo");
        Demo demo = (Demo) cls.getDeclaredConstructor().newInstance();
        Method method = cls.getMethod("show", String.class);
        method.invoke(demo, "Fuck your");
    }
}

class Demo {
    public Demo() {
    }

    public void show(String str) {
        System.out.println("Hello " + str);
    }
}