package com.offer.sort;


/**
 * 堆排序：
 *      第一步：建堆
 *      第二步：排序
 */
public class HeapSort {
    //调整堆,维护堆的性质
    public void heapify(int arr[], int n, int i){
        int largest = i;
        int lson = i*2+1;
        int rson = i*2+2;

        if(lson<n && arr[largest]<arr[lson]){
            largest = lson;
        }
        if(rson<n && arr[largest]<arr[rson]){
            largest = rson;
        }
        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n , largest);
        }
    }

    //堆排序入口
    public void heap_sort(int[] arr, int n){
        
        //建堆
        for (int i = n / 2-1; i >=0 ; i--) {
            heapify(arr, n, i);
        }

        //排序
        for(int i=n-1;i>0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, i, 0);
        }
    }

}
