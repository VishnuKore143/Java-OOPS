package ExceptionsHandling;
import java.io.*;
public class checkedAndUnchecked {
    static void meth1(){

        //this is checked exception
        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e.getMessage()); // throw only message of an exception
        }
    }
    static void meth2(){
        meth1();

        //checked exception
        FileInputStream fi = new FileInputStream("myFile.txt");
    }
    static void meth3(){
        meth2();
    }

    public static void main(String[] args) {
        meth3();
    }
}
