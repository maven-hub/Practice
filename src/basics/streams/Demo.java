package basics.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Aurelius", "Meditations", 567, 156, "Very interesting thoughts of a wise man"),
                new Book("Gaius", "How to conquer Gaul", 320, 43, "Good tips for ethnic genocide"),
                new Book("Lucius", "Problems of the plebs", 120, 98, "How do common people live?"),
                new Book("Cato", "The quality of a good orator", 856, 180, "Read this to learn how to speak"),
                new Book("Augustus", "Ruling an empire", 427, 12, "If you want to rule - this book has no equal"),
                new Book("Scribonia", "Qualities of being a cunt", 144, 32, "Ways of avoiding being a cunt"),
                new Book("Faustina", "Best advices for makeup", 24, 64, "This not a book about Faust"),
                new Book("Marcelus", "General way of learning slow", 88, 345, "Not very engaging"),
                new Book("Demeter", "Who will remember me?", 478, 207, "An attempt to be remembered"),
                new Book("Aurelius", "Meditations v2", 724, 158, "Very interesting thoughts of a wise man, part 2"))
        );

        List<String> list = books.stream()
                .filter(book -> book.getPages() > 100)
                .sorted()
                .map(Book::getTitle)
                .filter(title -> title.startsWith("M"))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
