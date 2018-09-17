package day07.TrainOne.Train6;

public class InvokeDirectorTest {
    public static void main(String[] args) {
        invokeDirector(() -> System.out.println("导演拍电影"));


    }

    private static void invokeDirector(Director d){
        d.makeMove();
    }
}
