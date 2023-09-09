import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();;
        
        if(n % 2 != 0){
            System.out.println("Weird");    
        }
        else if(n % 2 == 0 && 2<=n && n<=5){
            System.out.println("Not Weird");
        }
    }
}
