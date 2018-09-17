package day08.TrainOne.Train10;

public class Train10 {
        public static void main (String[]args){
            int n = 3;
            int result = factorial(n);
            System.out.println(result);
        }

    private static int factorial(int num){
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
