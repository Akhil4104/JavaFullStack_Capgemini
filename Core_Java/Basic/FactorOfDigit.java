package Basic;
import java.util.Scanner;
class FactorOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while (n > 0) {
            int digit = n % 10;
            System.out.println("Factors of digit " + digit + ":");

            if (digit == 0) {
                System.out.println("0 has no factors");
            } else {
                for (int i = 1; i <= digit; i++) {
                    if (digit % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
            n = n / 10;
        }
    }
}
