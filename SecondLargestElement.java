import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20};

        Arrays.sort(arr);

        int n = arr.length;
        int largest = arr[n - 1];

        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                System.out.println("Second Largest: " + arr[i]);
                return;
            }
        }

        System.out.println("No second largest element");
    }
}