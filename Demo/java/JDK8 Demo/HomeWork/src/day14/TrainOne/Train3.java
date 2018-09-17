package day14.TrainOne;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Train3 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("day14.TrainOne.Student");
        Object object = c.getDeclaredConstructor().newInstance();

        // System.out.println(object);

        // Constructor cons = c.getConstructor(int.class, String.class);

        /*Student cons = (Student) c.getDeclaredConstructor(int.class, String.class).newInstance(23, "jack");

        Student consNoParam = (Student) c.getDeclaredConstructor().newInstance();


        System.out.println(cons);
        System.out.println(consNoParam);*/

        //方式1：通过Class对象的方法创建。
        c.getConstructor().newInstance();
        System.out.println(object);
        //方式2：通过Constructor对象的方法创建。
        Constructor cons = c.getDeclaredConstructor(int.class,String.class);
        Object obj2 = cons.newInstance(23,"jack");
        System.out.println(obj2);

    }
}

class Student {
    private int age;
    private String name;

    public Student() {

    }

    public Student(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}
