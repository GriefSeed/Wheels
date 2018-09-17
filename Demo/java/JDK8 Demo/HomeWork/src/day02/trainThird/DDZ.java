package day02.trainThird;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 组牌
 洗牌
 发牌
 看牌
 */
public class DDZ {
    public static void main(String[] args){
        // 组牌：花色+数字
        // 四种花色
        ArrayList<String> colors = new ArrayList<>();
        // 添加四种花色
        Collections.addAll(colors,"♦","♣","♥","♠");
        System.out.println(colors);

        // 数字集合
        ArrayList<String> numbers = new ArrayList<>();
        // 添加数字
        Collections.addAll(numbers,"3","4","5","6","7","8","9","10","J","Q","K","A","2");

        // 拼接牌
        ArrayList<String> pokers = new ArrayList<>();
        for (String num :numbers) { // 3
            for (String color: colors) { //
                // 拼接牌
                String poker = color.concat(num); // ♦3
                // 添加到集合中
                pokers.add(poker);
            }
        }

        // 添加大小王
        pokers.add("🃏");
        pokers.add("🤴");
        System.out.println(pokers);


        ArrayList<String> player01;
        ArrayList<String> player02;
        ArrayList<String> player03;
        ArrayList<String> dp;

        while(true) {


            // 洗牌:将集合中的元素乱序
            Collections.shuffle(pokers);

            // 发牌
            player01 = new ArrayList<>();
            player02 = new ArrayList<>();
            player03 = new ArrayList<>();
            dp = new ArrayList<>();

            // 遍历集合发牌
            for (int index = 0; index < pokers.size(); index++) {
                // 根据索引获得牌
                String poker = pokers.get(index);
                if (index >= 51) {
                    dp.add(poker);
                } else if (index % 3 == 0) {
                    player01.add(poker);
                } else if (index % 3 == 1) {
                    player02.add(poker);
                } else {
                    player03.add(poker);
                }
            }

            if (player01.contains("🃏")) {
                player01.addAll(dp);
                break;
            } else if (player02.contains("🃏")) {
                player02.addAll(dp);
                break;
            } else if (player03.contains("🃏")) {
                player03.addAll(dp);
                break;
            } else {
                // 谁都拿不到大王，重新洗牌
                continue;
            }

        }
        // 看牌
        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);

        System.out.println(dp);
    }
}

