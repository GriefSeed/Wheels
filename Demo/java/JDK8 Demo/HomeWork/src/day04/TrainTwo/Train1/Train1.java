package day04.TrainTwo.Train1;

import java.util.HashMap;
import java.util.Scanner;

public class Train1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while(hashMap.size() < 5){
            String[] input = sc.nextLine().toString().split(" ");
            hashMap.put(input[0], Integer.valueOf(input[1]));
            hashMap.put(input[0], Integer.valueOf(input[1]));
        }

        System.out.println(hashMap);
    }
}
