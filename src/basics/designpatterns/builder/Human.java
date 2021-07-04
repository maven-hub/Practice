package basics.designpatterns.builder;

public class Human {
    private String name;
    private int age;
    private int iq;

    private Human(String name, int age, int iq) {
        this.name = name;
        this.age = age;
        this.iq = iq;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + iq;
    }

    public static class Builder {
        private String name;
        private int age;
        private int iq;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withIq(int iq) {
            this.iq = iq;
            return this;
        }

        public Human build() {
            return new Human(name, age, iq);
        }
    }
}
