public class n24 {
    public static void main(String rgs[]){
        int n =5;
        int number = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number + " ");
                number ++;
            }
            System.out.println();
        }
    }
}
