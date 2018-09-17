package day04.TrainTwo.Train10;

import java.util.HashMap;

public class Train10 {
    public static void main(String[] args) {
        String[] str1 = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] str2 = {"哈尔滨","杭州","南昌","广州","福州"};

        HashMap<String, String> hashMap = new HashMap<>();

        for(int i = 0; i < str1.length; i++){
            hashMap.put(str1[i], str2[i]);
        }

        System.out.println(hashMap);

    }
}
