import java.util.*;
public class n37 {
    public static int printSum(int n){
        int sum = 1;
        return 0;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++){

            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
