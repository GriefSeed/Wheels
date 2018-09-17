package day05.TrainThird.Train1;

public class DebitCard {
    private String accountNumber;
    private Long money;

    public DebitCard() {
    }

    public DebitCard(String accountNumber, Long money) throws Exception {
        this.accountNumber = accountNumber;
        setMoney(money);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) throws Exception {
        if(money < 0){
            throw  new Exception("金额不能为负");
        }
        this.money = money;
    }
}
