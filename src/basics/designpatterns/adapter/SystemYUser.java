package basics.designpatterns.adapter;

import java.util.Arrays;

public class SystemYUser {
    private String name;
    private int screenNumber;
    private long age;
    private String[] privileges;

    public SystemYUser(String name, int screenNumber, long age, String[] privileges) {
        this.name = name;
        this.screenNumber = screenNumber;
        this.age = age;
        this.privileges = privileges;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public void setScreenNumber(int screenNumber) {
        this.screenNumber = screenNumber;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String[] getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String[] privileges) {
        this.privileges = privileges;
    }

    @Override
    public String toString() {
        return name + " " + screenNumber + " " + age + " " + Arrays.toString(privileges);
    }
}
