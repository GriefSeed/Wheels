package day02.trainTwo.train2;

import day02.trainTwo.train1.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class IteratorTrain {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        Collections.addAll(personList, Person.newBuilder().withName("明明").withAge(12).withHigh(1.90f).build(),
                Person.newBuilder().withName("红红").withAge(15).withHigh(1.21f).build(),
                Person.newBuilder().withName("张张").withAge(11).withHigh(1.78f).build(),
                Person.newBuilder().withName("笑笑").withAge(19).withHigh(1.83f).build(),
                Person.newBuilder().withName("大胖").withAge(22).withHigh(1.65f).build()
                );


        Iterator it = personList.iterator();
        float max_person = 0f;
        float min_persion = 100f;

        while (it.hasNext()) {
            Person temp = (Person) it.next();
            if (max_person < temp.getHigh()) {
                max_person = temp.getHigh();
            } else if (min_persion > temp.getHigh()) {
                min_persion = temp.getHigh();
            }
        }


        System.out.println(String.format("最高身高：%1.2f, 最低身高：%1.2f",  max_person, min_persion));    }
}
