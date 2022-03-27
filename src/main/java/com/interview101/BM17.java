package com.interview101;
import java.util.*;

/**
 * 二分查找
 */
public class BM17 {
    public int search (int[] nums, int target) {
        // write code here

        int l = 0;
        int r = nums.length -1;
        while (l <= r){
            int mid = (l + r) / 2;
            if(nums[mid] == target){

                return mid;
            }
            else if(nums[mid] > target){
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String[] params = sc.nextLine().trim().split(" ");
//            sc.nextLine();
            int k = sc.nextInt();

            int len = params.length;
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = Integer.parseInt(params[i]);
            }
            System.out.println(arr.toString());
            System.out.println(k);
            BM17 bm17 = new BM17();
            int ans = bm17.search(arr, k);
            System.out.println(ans);
        }
    }
}
