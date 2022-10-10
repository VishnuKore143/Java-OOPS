package ExceptionHandling;

public class Main {
    public static void main(String[] args) throws Exception {
        meth1();

    }

    static void meth1() throws Exception{
        try {
            int a = area(-10, 5);
            System.out.println(a);
        }catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
    static int area(int l, int b)throws Exception{
        if (l<0||b<0)
            throw new Exception();
        return l*b;
    }
}