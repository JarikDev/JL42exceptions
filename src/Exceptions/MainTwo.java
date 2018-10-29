package Exceptions;

public class MainTwo {
    public static void main(String[] args) {
        System.out.println(new MainTwo().someMethod());
    }

    String someMethod() {
        try {
            System.out.println("try");
            Object o = null;
            // o.hashCode();
            return "try 1";
        } catch (NullPointerException e) {
            System.out.println("catch");
            return "catch 2";
        } finally {
            System.out.println("block finally");
            // return "finally 2";
        }
    }
}
