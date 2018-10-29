package Exceptions;

public class MainThree {
    public static void main(String[] args) {
        new MainThree().someMethod();
    }

    void someMethod() {
        try {
            System.out.println("try");

           /* while (true) {
            }*/
//            System.exit(0);
            // Object o = null;
            // o.hashCode();

        } finally {
            System.out.println("before exit");
            // System.exit(0);
            while (true) {
                throw new Error();

            }
            // System.out.println("after exit");
        }
    }
}