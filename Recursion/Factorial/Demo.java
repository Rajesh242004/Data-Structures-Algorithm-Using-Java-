package Recursion.Factorial;
import java.util.*;

public class Demo {
    public static long fact(int i){
        if(i!=0){
            return i*fact(i-1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int value=sc.nextInt();
        long result=fact(value);

        System.out.println();
        System.out.println("The factorial of the number "+value+" is "+result);
        sc.close();
        
    }
}
