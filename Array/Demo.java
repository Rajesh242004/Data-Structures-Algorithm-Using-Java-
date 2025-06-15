package Array;   //single dimension array
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        int marks[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the marks");
        int sum=0;

        for(int i=0;i<5;i++){
            marks[i] = sc.nextInt();
            sum=sum+marks[i];
        }

        System.out.println("the sum of the marks is"+sum);
        System.out.println("The average of the sum is"+sum/marks.length);
        sc.close();
    }
}
