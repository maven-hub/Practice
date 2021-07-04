package basics.designpatterns.builder;

public class Demo {
    public static void main(String[] args) {
        
        Human me = new Human.Builder()
                .withName("Milosz")
                .withIq(130)
                .withAge(35)
                .build();

        System.out.println(me);
    }
}
