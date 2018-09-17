package day02.trainOne.train7;

// 实现泛型接口不指定类型，其实现类也必须是泛型类
public class Impl02<T> implements GenericInterface<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
