package day03.TrainOne.Train10;

import java.util.ArrayList;

public class Train10 {
    public static void main(String[] args) {
        ArrayList<String> arr = add("qwe", "123", "ee", "tt", "yut");
        for(String s : arr){
            System.out.print("  " + s);
        }
    }

    private static ArrayList<String> add(String f1, String... str){
        ArrayList<String> arr = new ArrayList<>();
        for(String s : str){
            arr.add(s);
        }
        return arr;
    }

}
