package day02.trainTwo.train3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ForeachTrain {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        Collections.addAll(strList, "a","b", "c", "c", "a", "b", "b", "b", "a");

        System.out.println(frequency(strList, "a"));

    }

    private static int frequency(ArrayList<String> arr, String key){
        int sum = 0;
        for(String s : arr){
            if(key.equals(s.trim().toString())){
                sum++;
            }
        }


        return sum;
    }
}
