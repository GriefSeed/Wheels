package day02.trainTwo.train5;

import day02.trainTwo.train5.Person;

import java.util.ArrayList;
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
            Person p = (Person)it.next();
            p.setAge(p.getAge() + 2);
        }

        for(Person p : personList){
            System.out.println(p.toString());
        }


    }
}
