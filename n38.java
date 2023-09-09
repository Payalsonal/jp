import java.util.*;
public class n38 {
    public static void printGreaterNumber(int num1, int num2){
    if (num1 > num2) {
        System.out.println(num1);
        return;
    } else {
        System.out.println(num2);
        return;
    }
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.print("a is Greater than b");
        } else{
            System.out.print("a is lesser than b");
        }
    }
}
