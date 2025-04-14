package ImportantPrograms;

import java.util.Arrays;

public class UniquePairs1 {

	public static void main(String[] args) {
 int [] arr = {2,4,1,5,3,6,0,7,8};
 int target = 7;
 int low = 0;
 int high =arr.length-1;
 
 Arrays.sort(arr);

 while(low< high) {
	 if(arr[low]+arr[high]>target) {
		 high--;
		 
	 }else if(arr[low]+arr[high]<target) {
		 low++;
		 
	 }else if(arr[low]+arr[high]==target) {
		 System.out.println("pair("+arr[low] +", "+ arr[high]+" )");
		 low++;
		 high--;
		 
	 }
 }
 
	}

}

//import java.util.Arrays;
//
//public class UniquePairs1 {
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 1, 5, 3, 6, 0, 7, 8};
//        int target = 7;
//
//        // Sort the array first
//        Arrays.sort(arr);
//
//        int low = 0;
//        int high = arr.length - 1;
//
//        while (low < high) {
//            int sum = arr[low] + arr[high];
//
//            if (sum > target) {
//                high--;
//            } else if (sum < target) {
//                low++;
//            } else {
//                System.out.println("pair(" + arr[low] + ", " + arr[high] + ")");
//                low++;
//                high--;
//            }
//        }
//    }
//}
//



//import java.util.*;
//
//public class UniquePairsHashMap {
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 1, 5, 3, 6, 0, 7, 8};
//        int target = 7;
//
//        Map<Integer, Boolean> map = new HashMap<>();
//
//        for (int num : arr) {
//            int complement = target - num;
//
//            if (map.containsKey(complement) && map.get(complement)) {
//                System.out.println("pair(" + complement + ", " + num + ")");
//                // Mark as used
//                map.put(complement, false);
//                map.put(num, false);
//            } else {
//                map.put(num, true);
//            }
//        }
//    }
//}

