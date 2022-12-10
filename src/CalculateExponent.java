import java.util.Scanner;

public class CalculateExponent {
    public static void main(String[] args) {
        int x, n, i;
        int product = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number (x) : ");
        x = scanner.nextInt();

        System.out.print("Enter the exponent number (n) : ");
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            product *= x;
        }
        System.out.print(x + " to the power " + n + " : " + product);
    }
}
