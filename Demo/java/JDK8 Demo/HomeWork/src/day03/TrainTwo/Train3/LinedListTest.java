package day03.TrainTwo.Train3;

import java.util.Iterator;
import java.util.LinkedList;

public class LinedListTest {
    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "2347809933", "98765432102", "67891", "12347809933"};

        LinkedList<String> ll = new LinkedList<>();

        for(String s : strs){
            if(!ll.contains(s)){
                ll.add(s);
            }
        }
        for(String s : ll){
            System.out.print("  " + s);
        }

        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println("   " + it.next());
        }
    }
}
