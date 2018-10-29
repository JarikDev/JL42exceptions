package Exceptions;

public class MainFive {
    public static void main(String[] args) {
        new MainFive().someMethod();
    }

    void someMethod() {
        try {
            System.out.println("try");
            throw new MyException();
        } catch (MyException e) {
            System.out.println("my exception");
        }
    }
}