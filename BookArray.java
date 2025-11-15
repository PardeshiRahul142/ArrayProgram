class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void show() {
        System.out.println(title + " by " + author + " - ₹" + price);
    }
}

public class BookArray {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Java Basics", "James Gosling", 500),
            new Book("Data Structures", "Mark Allen", 700),
            new Book("Spring Boot", "Craig Walls", 650)
        };

        System.out.println("Book List:");
        for (Book b : books) {
            b.show();
        }
    }
}
