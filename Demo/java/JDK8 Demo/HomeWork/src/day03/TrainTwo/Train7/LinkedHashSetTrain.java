package day03.TrainTwo.Train7;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetTrain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedHashSet<Character> lhs = new LinkedHashSet<>();

        String input = in.nextLine();

        char[] c = input.toCharArray();

        for(char ch : c){
            lhs.add(ch);
        }

        for(char ch : lhs){
            System.out.print(ch);
        }
    }
}
