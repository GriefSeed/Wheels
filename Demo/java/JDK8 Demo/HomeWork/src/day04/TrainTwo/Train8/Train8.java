package day04.TrainTwo.Train8;

import java.util.*;

public class Train8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        HashMap<String, Integer> hashMap = new HashMap<>();

        while(hashMap.size() < 5){
            String name = in.nextLine();
            hashMap.put(name, r.nextInt(100));
        }

        Set<String> s = hashMap.keySet();

        Iterator<String> it = s.iterator();

        String oneKey = it.next();

        Integer defaultScore = hashMap.get(oneKey);

        int ScoreSum = 0;
        int maxScore = defaultScore;
        int minScore = defaultScore;

        for(String ss : s){
            if(hashMap.get(ss) > maxScore){
                maxScore = hashMap.get(ss);
            }
            if(hashMap.get(ss) < minScore){
                minScore = hashMap.get(ss);
            }

            ScoreSum += hashMap.get(ss);
        }

        System.out.println(String.format("总分：%s， 最低分：%s， 最高分： %s，平均分：%1.2s ", ScoreSum, minScore, maxScore, ScoreSum / hashMap.size()));


    }
}
