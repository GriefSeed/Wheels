package day04.TrainThird.Train1;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.Map.*;

public class Train1 {
    public static void main(String[] args) {
        HashMap<String, HashMap<Integer, String>> class_hashmap = new HashMap<>();
        HashMap<Integer, String> stu_hashmap1 = new HashMap<>(Map.of(1, "李晨", 2, "范冰冰"));
        HashMap<Integer, String> stu_hashmap2 = new HashMap<>(Map.of(1, "马云", 2, "马化腾"));

        class_hashmap.put("Java基础班", stu_hashmap1);
        class_hashmap.put("Java就业班", stu_hashmap2);

        Set<String> set = class_hashmap.keySet();

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key1 = it.next();
            System.out.println(key1);

            HashMap<Integer, String> temp = class_hashmap.get(key1);

            Set<Integer> iset = temp.keySet();

            Iterator<Integer> it2 = iset.iterator();

            while(it2.hasNext()){
                Integer key = it2.next();
                System.out.println(NumFormat.transNumFormat(key) + "   " + temp.get(key));
            }
        }


        System.out.println("=================================");

        Set<Entry<String, HashMap<Integer, String>>> sen = class_hashmap.entrySet();

        Iterator<Entry<String, HashMap<Integer, String>>> itn = sen.iterator();

        while(itn.hasNext()){
            Entry<String, HashMap<Integer, String>> entry = itn.next();

            String key3 = entry.getKey();

            System.out.println(key3);

            Set<Entry<Integer, String>> sett = entry.getValue().entrySet();

            Iterator<Entry<Integer, String>> ittt = sett.iterator();


            while(ittt.hasNext()){
                Entry<Integer, String> entity2 = ittt.next();
                System.out.println(NumFormat.transNumFormat(entity2.getKey()) + "    " + entity2.getValue());;
            }
        }

    }
}
