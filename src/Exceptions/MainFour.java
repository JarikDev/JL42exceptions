package Exceptions;

import java.io.IOException;

public class MainFour {
    public static void main(String[] args) {
        new MainTwo().someMethod();
    }

    void someMethod() {
        try {
            System.out.println("try");
            throw new Exception();
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                throw new RuntimeException();
            } catch (ArrayIndexOutOfBoundsException err) {

            }
        } catch (IOException e) {

        } catch (Exception e) {

        }
    }
}