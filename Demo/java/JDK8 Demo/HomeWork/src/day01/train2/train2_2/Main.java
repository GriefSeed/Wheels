package day01.train2.train2_2;

public class Main {
    public static void main(String[] args) {
        String str = "123";
        StringBuilder sb = new StringBuilder("123");

        Long strTimeStart = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            str += i;
        }
        Long strTimeEnd = System.currentTimeMillis();
        System.out.println((strTimeEnd - strTimeStart));


        Long sbTimeStart = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            sb.append(i);
        }
        Long sbTimeEnd = System.currentTimeMillis();
        System.out.println((sbTimeEnd - sbTimeStart));

    }
}
