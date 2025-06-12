public class Book {
    private String title;

    public Book() {
        this.title = "Unknown Title";
    }

    public Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "Book Title: " + title;

    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book otherBook = (Book) obj;
        return this.title.equals(otherBook.title);
    }

}