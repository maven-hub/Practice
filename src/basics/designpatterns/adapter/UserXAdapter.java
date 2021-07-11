package basics.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class UserXAdapter implements Unifiable {
    private SystemXUser systemXUser;

    public UserXAdapter(SystemXUser systemXUser) {
        this.systemXUser = systemXUser;
    }

    @Override
    public String getUsername() {
        return systemXUser.getName() + " " + systemXUser.getSurname();
    }

    @Override
    public Integer getAge() {
        return Integer.parseInt(systemXUser.getAge());
    }

    @Override
    public List<String> getPrivileges() {
        return new ArrayList<>(systemXUser.getPrivileges());
    }

    @Override
    public String toString() {
        return "Adapter User A: " + systemXUser;
    }
}
