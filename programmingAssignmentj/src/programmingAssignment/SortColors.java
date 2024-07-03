package programmingAssignment;

import java.util.Arrays;

public class SortColors {
//    public static void sortColors(int[] nums) {
//        int low = 0;
//        int mid = 0;
//        int high = nums.length - 1;
//
//        while (mid <= high) {
//            if (nums[mid] == 0) {
//                // Swap nums[low] and nums[mid]
//                int temp = nums[low];
//                nums[low] = nums[mid];
//                nums[mid] = temp;
//
//                // Move both low and mid pointers to the right
//                low++;
//                mid++;
//            } else if (nums[mid] == 1) {
//                // Move mid pointer to the right
//                mid++;
//            } else {
//                // Swap nums[mid] and nums[high]
//                int temp = nums[mid];
//                nums[mid] = nums[high];
//                nums[high] = temp;
//
//                // Move high pointer to the left
//                high--;
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 1, 0};
       Arrays.sort(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
