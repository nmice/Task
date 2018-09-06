package week10.quickSort;

import java.util.Comparator;

public class Book implements Comparable<Book> {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book o) {
        if (this.getAuthor().equals(o.getAuthor())) {
            return this.getTitle().compareTo(o.getTitle());
        }
        return author.compareTo(o.getAuthor());
    }

    public String toString() {
        return this.getAuthor() + " - " + this.getTitle();
    }
}

class BookAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}

class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}