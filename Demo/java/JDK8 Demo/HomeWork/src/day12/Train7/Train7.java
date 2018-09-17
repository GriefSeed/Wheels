package day12.Train7;

public class Train7 {
    public static void main(String[] args) {
        Car q7 = getCar(Car::new);
        q7.setBrand("奥迪");
    }

    public static Car getCar(BeanFactory<Car> factory) {
        return factory.getBean();
    }
}
