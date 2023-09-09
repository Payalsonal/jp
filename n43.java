import java.util.Scanner;

public class n43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base x: ");
        double x = sc.nextDouble();

        System.out.println("Enter the exponent n: ");
        double n = sc.nextDouble();

        System.out.println(" Print the result : ");
        double result = power(x,n);
        System.out.println(result);
    }

    public static double power(double x, double n) {
        double result = Math.pow(x, n);
        return result;
    }
}
/*System.out.print("Enter the base (x): ");
        double x = sc.nextDouble();

        System.out.print("Enter the exponent (n): ");
        double n = sc.nextDouble();

        double result = power(x, n);
        System.out.println(result);
    }

    public static double power(double x, double n) {
        double result = Math.pow(x, n);
        return result;*/