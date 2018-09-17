package day04.TrainThird.Train4;

import java.util.*;

/**
 * @author pkxing
 * @version 1.0
 * @Package com.itheima._04斗地主案例
 * @date 2018/5/29  上午11:59
 */
public class Train4 {
    public static void main(String[] args){
        // 组牌：花色+数字
        // 四种花色
        ArrayList<String> colors = new ArrayList<>();
        // 添加四种花色
        Collections.addAll(colors,"♦","♣","♥","♠");

        // 数字集合
        ArrayList<String> numbers = new ArrayList<>();
        // 添加数字
        Collections.addAll(numbers,"3","4","5","6","7","8","9","10","J","Q","K","A","2");

        // 定义变量充当牌的索引
        int index = 0;
        // 创建Map集合存储牌
        Map<Integer,String> pokers = new HashMap<>();

        for (String number:numbers ) {
            for (String color:colors) {
                // 拼接牌
                String poker = color.concat(number);
                // 存储牌到集合中
                pokers.put(index++,poker);
            }
        }
        // 添加大小王
        pokers.put(index++,"🃏");
        pokers.put(index,"🤴");

        System.out.println(pokers);

        /*// 获得键集合
        Set<Integer> keySet = pokers.keySet();
        // 创建ArrayList集合：用来存储牌的索引
        ArrayList<Integer> indexes = new ArrayList<>();
        // 将指定的集合的所有元素添加到当前集合
        indexes.addAll(keySet);*/


        // 创建ArrayList集合：用来存储牌的索引
        ArrayList<Integer> indexes = new ArrayList<>(pokers.keySet());

        // 洗牌
        Collections.shuffle(indexes);

        // 发牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> dp = new ArrayList<>();
        for (int i = 0; i < indexes.size(); i++) {
            // 获得牌的索引
            Integer pokerIndex = indexes.get(i);
            if(i >= 51){
                dp.add(pokerIndex);
            } else if(i % 3 == 0) {
                player01.add(pokerIndex);
            } else if(i % 3 == 1) {
                player02.add(pokerIndex);
            } else  {
                player03.add(pokerIndex);
            }
        }

        // 看牌
        lookPoker("小泽",player01,pokers);
        lookPoker("小苍",player02,pokers);
        lookPoker("小武",player03,pokers);
        lookPoker("底牌",dp,pokers);

        System.out.println(indexes);
        System.out.println(pokers);


    }

    /**
     * 查看玩家的牌
     * @param player 玩家集合
     *               [20, 33, 3, 21, 24, 31, 11, 27, 46, 14, 6, 43, 9, 44, 38, 0, 23]
     * @param pokers 牌的集合
     */
    public static void lookPoker(String name,ArrayList<Integer> player,Map<Integer,String> pokers){
        // 对玩家集合进行排序：升序
        Collections.sort(player);
        System.out.print(name+":");
        // 遍历玩家集合
        for(Integer key:player){
            // 根据键获得牌
            String poker = pokers.get(key);
            System.out.print(poker+", ");
        }
        System.out.println();
    }
}
