package basics.streams;

public class Book implements Comparable<Book> {
    private String author;
    private String title;
    private int pages;
    private int year;
    private String description;

    public Book(String author, String title, int pages, int year, String description) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.year = year;
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Author: " + author +  " || Title: " + title + " || Pages: " + pages + " || Year: " + year + " || Description: " + description;
    }

    @Override
    public int compareTo(Book o) {
        return author.compareTo(o.getAuthor());
    }
}