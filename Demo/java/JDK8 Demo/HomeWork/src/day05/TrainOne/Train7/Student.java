package day05.TrainOne.Train7;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        if(score < 0){
            throw new NoScoreException("分数不能为负数");
        }
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    private Student(Builder builder) {
        setName(builder.name);
        setScore(builder.score);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Student copy) {
        Builder builder = new Builder();
        builder.name = copy.getName();
        builder.score = copy.getScore();
        return builder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score < 0){
            throw new NoScoreException("分数不能为负数");
        }
        this.score = score;
    }


    public static final class Builder {
        private String name;
        private int score;

        private Builder() {
        }

        public Builder withName(String val) {
            name = val;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
