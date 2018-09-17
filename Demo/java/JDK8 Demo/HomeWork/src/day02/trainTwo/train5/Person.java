package day02.trainTwo.train5;

public class Person {
    private String name;
    private int age;
    private float high;

    public Person() {
    }

    public Person(String name, int age, int high) {
        this.name = name;
        this.age = age;
        this.high = high;
    }

    private Person(Builder builder) {
        setName(builder.name);
        setAge(builder.age);
        setHigh(builder.high);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Person copy) {
        Builder builder = new Builder();
        builder.name = copy.getName();
        builder.age = copy.getAge();
        builder.high = copy.getHigh();
        return builder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }


    public static final class Builder {
        private String name;
        private int age;
        private float high;

        private Builder() {
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withAge(int val) {
            age = val;
            return this;
        }

        public Builder withHigh(float val) {
            high = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", high=" + high +
                '}';
    }
}
