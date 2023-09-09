import java.util.*;
public class n34 {
    public static int CalculateProd(int a, int b){
    int prod =  a*b;
    return prod;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int prod = a * b;
        System.out.println(prod);
    }   
}
