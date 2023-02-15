import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        int digit;

        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num /= 10;
            System.out.print(digit + " + ");
        }

        System.out.print("= "+sum);
        System.out.println();
    }
}