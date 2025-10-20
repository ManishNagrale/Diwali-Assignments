import java.util.Scanner;

public class ReverseNumber {
    
    public static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversedNum = reverse(num);
        System.out.println("Reversed number: " + reversedNum);

    }
}

