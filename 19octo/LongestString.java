public class LongestString {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "watermelon", "kiwi"};
        int maxLength = 0;

        for (String str : arr) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }

        System.out.println("Length of the longest string: " + maxLength);
    }
}
