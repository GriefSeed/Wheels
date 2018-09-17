package day05.TrainTwo.Train2;

public class Person {
    private String name;
    private int lifeValue;

    public Person(String name, int lifeValue) {
        this.name = name;
        setLifeValue(lifeValue);
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if(lifeValue < 0){
            throw new NoLifeValueExption("生命值不能为负数");
        }
        this.lifeValue = lifeValue;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
