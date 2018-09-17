package day05.TrainTwo.Train1;

public class Son extends Father {

    /*@Override
    public void eat() throws TonguePainException{
        System.out.println("吃到石头");

        throw new TonguePainException("吃到石头，牙疼");
    };*/

    /*@Override
    public void eat() throws PainExecption{
        System.out.println("吃到石头");

        throw new ToothPainException("吃到石头，牙疼");
    };*/

    /*@Override
    public void eat() throws ToothPainException{
        System.out.println("吃到石头");

        throw new ToothPainException("吃到石头，牙疼");
    };*/

    /*@Override
    public void eat() throws ToothPainException {
        System.out.println("吃到石头");

        throw new BigToothPainException("吃到石头，牙疼");
    };*/

    @Override
    public void eat() throws ToothPainException {
        System.out.println("吃到石头");

        int choose = 1;
        switch (choose) {
            case 1:
                throw new BigToothPainException("吃到石头，牙疼");

            case 2:
                throw new FrontToothPainException("吃到石头，门牙疼");
        }
    }

    /*@Override
    public void drink() throws BigToothPainException{
        System.out.println("喝什么都没问题");
    }*/

    @Override
    public void drink(){
        try {
            System.out.println("喝什么都没问题");
            throw new ToothPainException("牙疼");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
