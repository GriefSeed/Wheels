package day07.TrainOne.Train10;

public class Goods {
    private String goodsName;

    public Goods() {
    }


    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsName='" + goodsName + '\'' +
                '}';
    }
}
