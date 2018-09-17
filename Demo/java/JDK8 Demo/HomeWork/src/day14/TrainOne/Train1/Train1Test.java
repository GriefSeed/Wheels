package day14.TrainOne.Train1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class Train1Test {

    Train1 t;

    @Before
    public void init() {
        if (t == null) {
            t = new Train1();
        }
    }

    @After
    public void close() {
        t = null;
    }

    @org.junit.Test
    public void add() {
        int result = t.add(2, 3);
        Assert.assertEquals("error", 5, result);
    }

    @org.junit.Test
    public void subtract() {
        int result = t.subtract(12, 2);
        // 故意设置减法期望值为10000
        Assert.assertEquals("减法有问题", 10000, result);
    }

    @org.junit.Test
    public void multiply() {
        int result = t.multiply(2, 3);
        Assert.assertEquals("乘法有问题", 6, result);
    }

    @org.junit.Test
    public void divide() {
        int result = t.divide(6, 3);
        Assert.assertEquals("除法有问题", 2, result);
    }
}