package ExceptionsHandling;

public class ThrowAndThrows {
    public static void main(String[] args) throws Exception {
        meth1();

    }

    static void meth1() throws Exception {
        int a = area(10, 5);
        System.out.println(a);
    }

    static int area(int l, int b) throws Exception {
        if (l < 0 || b < 0)
            throw new Exception("Area value must be positive");
        int ans = l * b;
        return ans;
    }


}

