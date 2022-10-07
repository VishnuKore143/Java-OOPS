package ExceptionsHandling;

public class MultipalEH {
    public static void main(String[] args) {
        try {
            int A[] = {10, 0, 8, 3, 5};

            //inner try
            try {
                int r = A[0] / A[1];
                System.out.println(r);
            } catch (ArithmeticException a) {
                System.out.println("Division by zero is error, please try again");
            }

            //outer try
            System.out.println(A[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array length is 5 and you provided 10, please try again");
        }
    }
}
