package day02.trainOne.train3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorTrain {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        Collections.addAll(strList, "abc1", "abc2", "abc3", "abc4");

        Iterator it = strList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
