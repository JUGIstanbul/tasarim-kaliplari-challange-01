package jug.istanbul.soru3;

public class Serum {

    private final int servingSize; // must
    private final int servings; // must
    private final int calories; // optional
    private final int fat;  // optional
    private final int sodium; // optional
    private final int carbohydrate; // optional


    private Serum(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Serum build() {
            return new Serum(this);
        }
    }

    public String toString() {
        return "Serum{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    public static void main(String[] args) {

        Serum cocaCola = new Serum.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();

        System.out.println(cocaCola);
    }

}
