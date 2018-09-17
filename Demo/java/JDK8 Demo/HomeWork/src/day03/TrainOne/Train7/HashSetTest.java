package day03.TrainOne.Train7;

import java.util.Collections;
import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<>();

        Collections.addAll(hs, Person.newBuilder().withName("cortane").withAge(12).build(),
                Person.newBuilder().withName("easy").withAge(11).build(),
                Person.newBuilder().withName("dodo").withAge(10).build(),
                Person.newBuilder().withName("bubu").withAge(18).build());

        for(Person p : hs){
            System.out.println(p);
        }
    }
}
