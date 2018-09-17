package day03.TrainTwo.Train9;

import day02.trainTwo.train5.Person;

import java.util.HashSet;
import java.util.Iterator;

public class Train9 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        int i = 0;
        while (i < 5) {
            hs.add(Student.newBuilder().withName("学生" + i + "号").withAge(i).withScore(i * 10).build());
            i++;
        }
        Iterator<Student> it = hs.iterator();

        Student s = it.next();

        int score_sum = 0;

        int max_score = s.getScore();
        int min_score = s.getScore();

        for(Student student : hs){
            score_sum += student.getScore();
            if(max_score < student.getScore()){
                max_score = student.getScore();
            }
            if(min_score > student.getScore()){
                min_score = student.getScore();
            }
        }
        System.out.println(String.format("最高分是：%s", max_score));
        System.out.println(String.format("最低分是：%s", min_score));
        System.out.println(String.format("平均分是：%s", score_sum / hs.size()));
    }
}
