package Array;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the 3x3 matrix:");
        
        // Input elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        System.out.println("Diagonal elements are:");
        for (int i = 0; i < 3; i++) {
            System.out.print(a[i][i] + " ");
            sum += a[i][i];
        }

        System.out.println("\nSum of diagonal elements: " + sum);
        sc.close();
    }
}
