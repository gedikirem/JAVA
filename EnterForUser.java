//Write a Java program to accept two numbers from the user and calculate sum and product.

package enterforuser;
import java.util.*;
public class EnterForUser {
    public static void main(String[] args) {
       int a,b,sum=0,multiplication=0;
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter 1st number: ");
       a=scan.nextInt();
       System.out.println("Enter 2nd number: ");
       b=scan.nextInt();
       sum=a+b;
       multiplication=a*b;
       System.out.println("Sum: "+sum);
       System.out.println("Multiplication: "+multiplication);
       
    }
    
}
