package com.offer;

public class JZ53    {
    public int GetNumberOfK(int [] array , int k) {
        int l =  getFirstK(array,k);
        int r = getLastK(array, k);

        System.out.println("l:" + l);
        System.out.println("r:" + r);
        if(l>-1 && r>-1){
            return r - l + 1;
        }
        else {
            return 0;
        }
    }

    private int getFirstK(int[] array, int k){
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (left <= right){
            mid = (left + right) >> 1;
            if(array[mid] == k){
                if(mid == left || array[mid - 1] != k) {
                    return mid;
                }
                else {
                    right = mid - 1;
                }
            }
            else if(array[mid] < k){
                left = mid + 1;
            }
            else if(array[mid] > k){
                right = mid - 1;
            }
        }
        return -1;
    }
    private int getLastK(int[] array, int k){
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (left <= right){
            mid = (left + right) / 2;
            if(array[mid] == k){
                if(mid == right || (mid + 1 <= array.length -1 &&array[mid + 1] > k) ) {
                    return mid;
                }
                else{
                    left = mid + 1;
                }
            }
            else if(array[mid] < k){
                left = mid + 1;
            }
            else if(array[mid] > k){
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a = new int[]{4};
        int k = 3;
        JZ53 G = new JZ53();
        System.out.println(G.GetNumberOfK(a, k));
    }
}
