package day05.TrainThird.Train1;

import java.text.DateFormat;

public class Test {
    public static void main(String[] args) {
        DebitCard d = new DebitCard();
        try {
            d.setMoney(-10L);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
