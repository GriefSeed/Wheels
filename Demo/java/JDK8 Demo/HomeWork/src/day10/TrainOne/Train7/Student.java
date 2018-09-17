package day10.TrainOne.Train7;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private static final long serialVersionUID = 49836597169617052L;
    private String name;
    private int age;
    private char sex;

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private Student(Builder builder) {
        name = builder.name;
        age = builder.age;
        sex = builder.sex;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Student copy) {
        Builder builder = new Builder();
        builder.name = copy.getName();
        builder.age = copy.getAge();
        builder.sex = copy.getSex();
        return builder;
    }


    public static final class Builder {
        private String name;
        private int age;
        private char sex;

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

        public Builder withSex(char val) {
            sex = val;
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
                sex == student.sex &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, sex);
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
