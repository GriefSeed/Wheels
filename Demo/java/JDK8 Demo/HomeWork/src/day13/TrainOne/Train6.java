package day13.TrainOne;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Train6 {
    public static void main(String[] args) {
        // 创建集合存储学生对象
        ArrayList<Student> stus = new ArrayList<>();
        stus.add(new Student("jack", 23, 100));
        stus.add(new Student("rose", 18, 98));
        stus.add(new Student("lily", 25, 88));
        stus.add(new Student("lucy", 16, 60));

        ArrayList<Student> students = filterMeh(s -> s.getAge() < 20, s -> s.getScore() > 80, stus);

        System.out.println(students);
    }

    public static ArrayList<Student> filterMeh(Predicate<Student> p1, Predicate<Student> p2, ArrayList<Student> arr) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : arr) {
            if (p1.and(p2).test(s)) {
                result.add(s);
            }
        }

        return result;
    }

}

class Student {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
