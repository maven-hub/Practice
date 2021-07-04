package basics.designpatterns.adapter;

import java.util.Set;

public class UserSystemA {
    private String name;
    private String surname;
    private String age;
    private Set<String> privileges;

    public UserSystemA(String name, String surname, String age, Set<String> privileges) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.privileges = privileges;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Set<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Set<String> privileges) {
        this.privileges = privileges;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + privileges;
    }
}
