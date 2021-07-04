package basics.comparators;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Person[] peopleArray = new Person[]{
                new Person("Tomek", "Tomowski", 17),
                new Person("Agata", "Agatowa", 34),
                new Person("Agata", "Agacka", 34),
                new Person("Rysiek", "Rysiewski", 56),
                new Person("Rysiek", "Rysiewski", 15),
                new Person("Beata", "Bykowska", 12),
                new Person("Beata", "Bykowska", 28),
                new Person("Cykoria", "Cykorska", 25),
                new Person("Cecylia", "Cycata", 20)
        };

        List<Person> peopleList = new ArrayList<>(List.of(peopleArray));

        // za pomocą implementacji comparable w klasie Person
        Collections.sort(peopleList);
        System.out.println(peopleList);

        // za pomocą osobnych klas comparatora implementujących jego interfejs
        peopleList.sort(new PersonNameComparator());
        System.out.println(peopleList);

        peopleList.sort(new PersonSurnameComparator());
        System.out.println(peopleList);

        // odwrócenie sortowania
        peopleList.sort(new PersonAgeComparator().reversed());
        System.out.println(peopleList);

        // sortowanie tablic za pomocą comparatora
        // tylko trzeba najpierw usunąć nadpisanie compareTo w Person
        Arrays.sort(peopleArray, Comparator.comparing(Person::getName));
        System.out.println(Arrays.toString(peopleArray));

    }
}
