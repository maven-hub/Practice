package basics.comparators;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        // porównywanie jedynie po imieniu
        int result = this.name.compareTo(o.name);

        // porównywanie dodatkowo po nazwisku w przypadku takich samych imion (następnie po wieku rosnąco)
        if (result == 0) {
            result = this.surname.compareTo(o.surname);
            if (result == 0) {
                result = this.age - o.age;
            }
        }

        // zwracanie wyniku w postaci inta = -1, 0 lub 1
        return result;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
