package Arrays;

import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //5
        int[] arr = new int[n]; // 5
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt(); //1 3 4 5 6
        }
        boolean ans = isSorted(arr,n);
        if (ans==true){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static boolean isSorted(int[]arr, int n){
        for (int i=1; i<n; i++){
            if (arr[i]<arr[i-1]){
                return  false;
            }
        }
        return true;
    }
}
