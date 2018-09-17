package day03.TrainTwo.Train9;

public class Student {
    private String name;
    private int age;
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    private Student(Builder builder) {
        setName(builder.name);
        setAge(builder.age);
        setScore(builder.score);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Student copy) {
        Builder builder = new Builder();
        builder.name = copy.getName();
        builder.age = copy.getAge();
        builder.score = copy.getScore();
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public static final class Builder {
        private String name;
        private int age;
        private int score;

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

        public Builder withScore(int val) {
            score = val;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
