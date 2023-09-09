//Java Program to Calculate the GCD of two numbers
import java.util.Scanner;  
public class n44   
{  
    public static void main(String[] args)    
    {
        //Take input from the user
        //Create an instance of the Scanner class
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the first number: ");  
        int num1 = sc.nextInt();  
        System.out.println("Enter the second number: ");  
        int num2 = sc.nextInt();  
        while(num1 != num2) 
        {
          if(num1 > num2) 
          {
            num1 -= num2;
          }
          else 
          {
            num2 -= num1;
          }
        }
      System.out.println("GCD of given two numbers is :"+num1);
   }  
}  