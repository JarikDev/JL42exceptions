package Exceptions;

public class Main {
    public static void main(String[] args) {
        new Main().someMethod();

    }

    void someMethod() {
        try {
            Object o = null;
            o.hashCode();
            //  throw new Exception();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }finally{
            System.out.println("block finally rus anyways");
        }
    }
}
