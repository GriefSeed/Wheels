package day02.trainOne.train1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TrainCollectionMethod {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();

        Collections.addAll(collection,1,2,3,4,5);
        collection.remove(3);
        System.out.println(String.format("移除元素 %s ",3));
        System.out.println(String.format("长度为 %s ",collection.size()));

        collection.stream().forEach(System.out::println);
        collection.clear();



    }
}
