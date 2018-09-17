package day08.TrainOne.Train9;

public class Train9 {
    public static void main(String[] args) {
        int n = 100;
        int result = sum(n);
        System.out.println(result);
    }

    private static int sum(int num){
        if(num == 1){
            return 1;
        }
        return num + sum(num - 1);
    }
}
