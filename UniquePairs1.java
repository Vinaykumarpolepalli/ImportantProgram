package ImportantPrograms;

import java.util.Arrays;

public class UniquePairs1 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 3, 6, 0, 7, 8};
        int target = 7;

        // Sort the array first
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int sum = arr[low] + arr[high];

            if (sum > target) {
                high--;
            } else if (sum < target) {
                low++;
            } else {
                System.out.println("pair(" + arr[low] + ", " + arr[high]+")");
                low++;
                high--;
            }
        }
    }
}

