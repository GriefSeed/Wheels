package day12.Train14;

import java.util.*;
import java.util.function.Consumer;

public class Train14 {
    public static <T> void doJob(Consumer<T> consumer, T t) {
        consumer.accept(t);
    }

    public static <T> void doJob(Consumer<T> consumer1, Consumer<T> consumer2, T t) {
        consumer1.andThen(consumer2).accept(t);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //key:姓名 value:成绩•
        map.put("渣渣辉", 98);
        map.put("蓝小月", 65);
        map.put("皮几万", 70);
        map.put("岑小村", 59);
        map.put("谷天洛", 82);

        // a)打印谷天洛的分数
        doJob((HashMap<String, Integer> m) -> {
            System.out.println(m.get("谷天洛"));
        }, map);

        // b)打印最高分
        doJob((HashMap<String, Integer> m) -> {
            Set<String> keyList = m.keySet();
            String temp = keyList.iterator().next();
            for (String key : keyList) {
                if (m.get(key) > m.get(temp)) {
                    temp = key;
                }
            }
            System.out.println(m.get(temp));
        }, map);

        // c)分别以60分和70分为及格线，打印及格的人的名字

        doJob((HashMap<String, Integer> m) -> {
            Set<String> keyList = m.keySet();
            ArrayList<String> nameList = new ArrayList<>();
            for (String key : keyList) {
                if (m.get(key) > 60) {
                    nameList.add(key);
                }
            }
            System.out.println("===============60分及格=================");
            nameList.forEach(s -> System.out.print(s + " "));
            System.out.println();


        }, (HashMap<String, Integer> m) -> {
            Set<String> keyList = m.keySet();
            ArrayList<String> nameList = new ArrayList<>();
            for (String key : keyList) {
                if (m.get(key) > 70) {
                    nameList.add(key);
                }
            }
            System.out.println("===============70分及格=================");
            nameList.forEach(s -> System.out.print(s + " "));
            System.out.println();

        }, map);



    }

}
