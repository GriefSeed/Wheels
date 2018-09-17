package day01.ExceptionExam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Goods> goodsList = new ArrayList<>();
        goodsList.add(Goods.newBuilder().withId(1).withName("少林核桃").withCost(15.5f).withUnit('斤').build());
        goodsList.add(Goods.newBuilder().withId(2).withName("尚康饼干").withCost(14.5f).withUnit('包').build());
        goodsList.add(Goods.newBuilder().withId(3).withName("移动硬盘").withCost(345.0f).withUnit('个').build());
        goodsList.add(Goods.newBuilder().withId(4).withName("高清无码").withCost(199.0f).withUnit('G').build());

        HashMap<Integer, Integer> myList = new HashMap<>();

        while (true) {
            System.out.println("请输入你要进行的操作：");
            System.out.println("1：购买商品   2：结算并打印小票  3：退出系统");
            int num = in.nextInt();
            // int num = 1;
            if (num == 1) {
                for (Goods goods : goodsList) {
                    System.out.println(goods.toString());
                }
                System.out.println("---------------------------------------------------------");

                System.out.println("请输入你要购买的商品项(输入格式：商品ID-购买数量)，输入end表示购买结束");
                String input;
                ArrayList<String> buyList = new ArrayList<>();
                while (in.hasNext()) {
                    if(!(input = in.nextLine()).trim().toString().equals("end")){
                        String[] single = input.split("-");
                        if(single.length == 2){
                            if (single[0] != null & single[1] != null) {
                                myList.put(Integer.valueOf(single[0]), Integer.valueOf(single[1]));
                            }
                        }
                    }
                    else{
                        System.out.println("结束选购");
                        break;
                    }
                }
            }
            else if(num == 2){
                if(myList.isEmpty()){
                    System.out.println("还没选东西，怎么结账！");
                    continue;
                }
                System.out.println("---------------------------------------------------------------");
                System.out.println("         欢迎光临             ");
                System.out.println("名称                 售价               数量                金额");
                System.out.println("---------------------------------------------------------------");
                ArrayList<Goods> showList = new ArrayList<>();

                goodsList.stream().filter(s -> myList.containsKey(s.getId())).forEach(s -> {
                    System.out.println(s.getName() + "   " + s.getCost() + "   " + myList.get(s.getId()) + "  " + s.getCost() * Integer.valueOf(myList.get(s.getId())));
                });

                System.out.println(myList.size()+ "项商品");
                int amount = 0;
                int allNum = 0;
                for(Goods goods:goodsList){
                    if(myList.containsKey(Integer.valueOf(goods.getId()))){
                        allNum += myList.get(Integer.valueOf(goods.getId()));
                        amount += myList.get(Integer.valueOf(goods.getId())) * goods.getCost();
                    }
                }

                System.out.println(String.format("共计：%s件",allNum));
                System.out.println(String.format("共：%s元",amount));



            }

            else if(num == 3){
                System.out.println("退出程序");
                break;
            }
        }
    }
}
