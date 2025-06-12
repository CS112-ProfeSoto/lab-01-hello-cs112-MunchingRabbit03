public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        nightOwl();
        int result = subtractOne(1);
        System.out.println("Subtracting! 1 from 1:  " + result);
    }

    public static void nightOwl() {
        System.out.println("I do things really late at night, sorry!");
    }

    public static int subtractOne(int number) {
        return number - number;
    }
    


}