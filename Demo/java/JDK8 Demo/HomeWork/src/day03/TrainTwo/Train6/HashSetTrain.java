package day03.TrainTwo.Train6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class HashSetTrain {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        Random r = new Random();

        while(hs.size() < 10){
            hs.add(r.nextInt(20)+ 1);
        }

        Iterator<Integer> it = hs.iterator();

        while(it.hasNext()){
            System.out.print("    " + it.next());
        }
    }
}
