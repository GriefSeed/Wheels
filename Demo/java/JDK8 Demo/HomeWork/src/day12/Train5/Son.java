package day12.Train5;

public class Son extends Father {
    @Override
    public void askMoney() {
        System.out.println("向家中的财政老大要钱交(上)学(网)费(吧)...");
    }

    @Override
    public void spendMoney() {
        System.out.println("去网吧付钱给网管开了一台机器...");
    }

    public void helpFather(Helper helper) {
        helper.help();
    }

    //完成帮助Father打酱油的方法
    public void daJiangYou() {
        helpFather(super::askMoney);
        helpFather(super::spendMoney);
    }
}
