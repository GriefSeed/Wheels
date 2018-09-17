package day02.trainOne.train7;

public class GenericTrain {
    public static void main(String[] args) {
        GenericInterface<String> impl01 = new Impl01();
        GenericInterface<Integer> impl02 = new Impl02<>();

        impl01.show("Fuck");
        impl02.show(123);
    }
}
