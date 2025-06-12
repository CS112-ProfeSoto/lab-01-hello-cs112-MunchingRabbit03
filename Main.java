public class Main {
    public static void main(String[] args) {
        Book book1 = new Book ("Diary of the Wimpy Kid");
        Book book2 = new Book("Harry Potter");
        Book book3 = new Book("Catch me If you can");
        Book anotherBook = new Book("Catch me If you can");

        System.out.println("Welcome to CS 112!");
        nightOwl();

        int result = subtractOne(1);
        System.out.println("Subtracting! 1 from 1:  " + result);
        
        System.out.println(book1);
        System.out.println(book3);

        System.out.println(book1.equals(book2));
        System.out.println(book3.equals(anotherBook));
    }

    public static void nightOwl() {
        System.out.println("I do things really late at night, sorry!");
    }

    public static int subtractOne(int number) {
        return number - number;
    }



}