class Book {

    String title;
    String author;
    int year;

    Book() {
        title = "unknown";
        author = "unknown";
        year = 0;
    }

    Book(String title) {
        this.title = title;
        author = "unknown";
        year = 0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        year = 0;
    }

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("-------------------");
    }
}

public class BookInfo {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Java");
        Book b3 = new Book("C#", "Ahmed");
        Book b4 = new Book("C++", "Sabah", 2027);

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
        b4.printInfo();
    }
}