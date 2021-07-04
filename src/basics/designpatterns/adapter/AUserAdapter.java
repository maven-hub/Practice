package basics.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class AUserAdapter implements User {
    private UserSystemA userSystemA;

    public AUserAdapter(UserSystemA userSystemA) {
        this.userSystemA = userSystemA;
    }

    @Override
    public String getUsername() {
        return userSystemA.getName() + " " + userSystemA.getSurname();
    }

    @Override
    public Integer getAge() {
        return Integer.parseInt(userSystemA.getAge());
    }

    @Override
    public List<String> getPrivileges() {
        return new ArrayList<>(userSystemA.getPrivileges());
    }

    @Override
    public String toString() {
        return "Adapter User A: " + userSystemA;
    }
}
