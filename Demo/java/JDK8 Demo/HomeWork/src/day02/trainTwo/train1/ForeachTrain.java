package day02.trainTwo.train1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ForeachTrain {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();
        Collections.addAll(stuList, Student.newBuilder().withName("小明").withAge(12).withScore(98).build(),
                Student.newBuilder().withName("小红").withAge(13).withScore(38).build(),
                Student.newBuilder().withName("小军").withAge(14).withScore(68).build(),
                Student.newBuilder().withName("小张").withAge(15).withScore(28).build(),
                Student.newBuilder().withName("小陈").withAge(16).withScore(18).build()
        );
        Iterator it = stuList.iterator();

        int sum = 0;
        int max_score = 0;
        int min_score = 100;

        while (it.hasNext()) {
            Student temp = (Student) it.next();
            sum += temp.getScore();
            if (max_score < temp.getScore()) {
                max_score = temp.getScore();
            } else if (min_score > temp.getScore()) {
                min_score = temp.getScore();
            }
        }

        float avg = 0.00f;
        avg = max_score / stuList.size();

        System.out.println(String.format("总分：%s, 最高分：%s, 最低分：%s, 平均分：%s", sum, max_score, min_score, avg));

    }
}
