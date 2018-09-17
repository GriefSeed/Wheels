package day05.TrainTwo.Train1;

public class Father {
    public void eat() throws ToothPainException{
        System.out.println("吃到石头");

        throw new ToothPainException("吃到石头，牙疼");
    };

    public void drink(){
        System.out.println("喝什么都没问题");
    }
}
