package day03.TrainThird.Train2;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    private Student(Builder builder) {
        setName(builder.name);
        setAge(builder.age);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Student copy) {
        Builder builder = new Builder();
        builder.name = copy.getName();
        builder.age = copy.getAge();
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


    public static final class Builder {
        private String name;
        private int age;

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

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
