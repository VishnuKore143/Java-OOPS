package ExceptionsHandling;

public class TryAndCatchBlock {
    public static void main(String[] args) {
        try{
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[4]);
        }catch (Exception e){
            System.out.println("Something went wrong!!");
        }
    }
}
