package day04.TrainThird.Train1;

public class NumFormat {
    public static String transNumFormat(int num){
        int zero = 0;
        int origin = num;
        while(num > 0){
            num /= 10;
            zero++;
        }

        StringBuilder sb = new StringBuilder();
        while(zero >= 0){
            sb.append("0");
            zero--;
        }
        return sb.toString() + origin;
    }
}
