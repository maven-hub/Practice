package basics.designpatterns.adapter;

import java.util.List;

public interface User {
    String getUsername();
    Integer getAge();
    List<String> getPrivileges();
}
