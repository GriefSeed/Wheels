package day02.trainOne.train6;

public class GenericTrain {
    public static void main(String[] args) {
        Integer num = 1;


        String str = "what the fuck";

        genericMethod(num);
        genericMethod(str);
    }

    private static <T> void genericMethod(T t){
        System.out.println(t);
    }

}
