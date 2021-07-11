package basics.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        SystemXUser userA = new SystemXUser("Michael", "Corleone", "45", Set.of("USER", "ADMIN"));
        SystemYUser userB = new SystemYUser("Fredo", 66, 40L, new String[]{"USER"});

        List<Unifiable> users = new ArrayList<>();
        users.add(new UserXAdapter(userA));
        users.add(new UserYAdapter(userB));

        System.out.println(users);
    }
}
