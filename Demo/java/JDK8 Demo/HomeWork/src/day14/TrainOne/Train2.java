package day14.TrainOne;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Train2 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>(List.of(111, 222, 333));
        Class c = list.getClass();
        Method method = c.getMethod("add", Object.class);

        method.invoke(list, "aaa");
        System.out.println(list);
    }
}
