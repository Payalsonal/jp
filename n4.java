import java.util.*;
public class n4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = (a*b) / (a-b);
        System.out.println(ans);
    }
}
