import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " distinct numbers from 0 to " + size + ":");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int total = size * (size + 1) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        int missingNumber = total - sum;
        System.out.println("The missing number is: " + missingNumber);

    }
}
