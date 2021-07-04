package basics.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        UserSystemA userA = new UserSystemA("Michael", "Corleone", "45", Set.of("USER", "ADMIN"));
        UserSystemB userB = new UserSystemB("Fredo", 66, 40L, new String[]{"USER"});

        List<User> users = new ArrayList<>();
        users.add(new AUserAdapter(userA));
        users.add(new BUserAdapter(userB));

        System.out.println(users);
    }
}
