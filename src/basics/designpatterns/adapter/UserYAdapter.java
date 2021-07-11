package basics.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class UserYAdapter implements Unifiable {
    private SystemYUser systemYUser;

    public UserYAdapter(SystemYUser systemYUser) {
        this.systemYUser = systemYUser;
    }

    @Override
    public String getUsername() {
        return systemYUser.getName() + " " + systemYUser.getScreenNumber();
    }

    @Override
    public Integer getAge() {
        return (int) systemYUser.getAge();
    }

    @Override
    public List<String> getPrivileges() {
        return new ArrayList<>(List.of(systemYUser.getPrivileges()));
    }

    @Override
    public String toString() {
        return "Adapter User B: " + systemYUser;
    }
}
