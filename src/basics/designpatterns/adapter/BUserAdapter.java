package basics.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class BUserAdapter implements User {
    private UserSystemB userSystemB;

    public BUserAdapter(UserSystemB userSystemB) {
        this.userSystemB = userSystemB;
    }

    @Override
    public String getUsername() {
        return userSystemB.getName() + " " + userSystemB.getScreenNumber();
    }

    @Override
    public Integer getAge() {
        return (int) userSystemB.getAge();
    }

    @Override
    public List<String> getPrivileges() {
        return new ArrayList<>(List.of(userSystemB.getPrivileges()));
    }

    @Override
    public String toString() {
        return "Adapter User B: " + userSystemB;
    }
}
