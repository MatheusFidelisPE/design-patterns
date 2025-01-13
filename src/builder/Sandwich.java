package builder;

public class Sandwich {

    private String bread;
    private String meat;
    private String cheese;
    private String veggies;
    private String condiments;

    public Sandwich(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.veggies = builder.veggies;
        this.condiments = builder.condiments;
    }

    public static class Builder {
        private String bread;
        private String meat;
        private String cheese;
        private String veggies;
        private String condiments;

        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }
        public Builder setMeat(String meat) {
            this.meat = meat;
            return this;
        }
        public Builder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }
        public Builder setVeggies(String veggies) {
            this.veggies = veggies;
            return this;
        }
        public Builder setCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }
        public Sandwich build() {
            return new Sandwich(this);
        }

    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", veggies='" + veggies + '\'' +
                ", condiments='" + condiments + '\'' +
                '}';
    }
}
