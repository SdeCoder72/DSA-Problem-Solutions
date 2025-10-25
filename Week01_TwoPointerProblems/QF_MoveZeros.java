package Week01_TwoPointerProblems;

import java.util.Scanner;

public class QF_MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array of size  " + n + " : ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        moveZeroes(arr);
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }
        }
        while (i < n) {
            arr[i] = 0;
            i++;
        }
    }
}
