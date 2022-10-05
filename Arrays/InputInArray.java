package Arrays;

import java.util.Scanner;

public class InputInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //5 size of the array
        int[] arr = new int[n]; //5 size of array as number
        for (int i=0; i<n;  i++){
            arr[i] = sc.nextInt(); // input value inside array
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" "); //printing array data
        }
    }
}
