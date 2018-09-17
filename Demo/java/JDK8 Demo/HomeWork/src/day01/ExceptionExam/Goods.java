package day01.ExceptionExam;

public class Goods {
    private int id;
    private String name;
    private float cost;
    private char unit;

    public Goods() {
    }

    public Goods(int id, String name, float cost, char unit) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.unit = unit;
    }

    private Goods(Builder builder) {
        setId(builder.id);
        setName(builder.name);
        setCost(builder.cost);
        setUnit(builder.unit);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Goods copy) {
        Builder builder = new Builder();
        builder.id = copy.getId();
        builder.name = copy.getName();
        builder.cost = copy.getCost();
        builder.unit = copy.getUnit();
        return builder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public char getUnit() {
        return unit;
    }

    public void setUnit(char unit) {
        this.unit = unit;
    }


    public static final class Builder {
        private int id;
        private String name;
        private float cost;
        private char unit;

        private Builder() {
        }

        public Builder withId(int val) {
            id = val;
            return this;
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withCost(float val) {
            cost = val;
            return this;
        }

        public Builder withUnit(char val) {
            unit = val;
            return this;
        }

        public Goods build() {
            return new Goods(this);
        }
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + NumFormat.transNumFormat(id) +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", unit=" + unit +
                '}';
    }
}
