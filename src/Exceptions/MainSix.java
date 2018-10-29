package Exceptions;

import java.io.File;
import java.io.IOException;

public class MainSix {
    public static void main(String[] args) {
        try {
            new MainSix().someMethod();
        } catch (Throwable e) {

        }
    }

    void someMethod() throws IOException, RuntimeException {
        File file = new File("");
        file.createNewFile();
        // throw new IOException();
        try {
            throw new RuntimeException();
        }catch (RuntimeException e){}

    }
    void methodTwo(){
  /*      checked
        throw new Throwable();
        throw new Exception();
        throw new IOException();
        unckecked
        throw new Error();
        throw new RuntimeException();*/


    }
}