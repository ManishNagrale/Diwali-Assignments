import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        // Sum of first n odd numbers = n²
        int sum = n * n;

        System.out.println("Sum of first " + n + " odd numbers is: " + sum);
    }
}

