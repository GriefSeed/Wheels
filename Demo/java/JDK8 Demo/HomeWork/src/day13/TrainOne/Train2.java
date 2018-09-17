package day13.TrainOne;


import java.sql.SQLOutput;

/**
 * 函数式接口：只有一个抽象方法的接口
 *
 * @FunctionallInterface 声明函数式接口，如果不满足条件，会编译报错
 */
public class Train2 {
    public static void main(String[] args) {
        Eatable e = () -> System.out.println("fuck");
        fuckMethod(e);

        System.out.println(fuckMethod2(2, 3, (a, b) -> a + b));

    }

    public static void fuckMethod(Eatable e) {
        e.eat();
    }

    public static int fuckMethod2(int a, int b, Sumable e) {
        return e.sum(a, b);
    }

}


@FunctionalInterface
interface Eatable {
    void eat();
}

@FunctionalInterface
interface Sumable {
    int sum(int a, int b);
}