import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number a : ");
        int a = sc.nextInt();
        System.out.print("Enter second number b : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
        
    }
}
