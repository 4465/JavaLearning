package exam.duoduo;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n,v;
            n = sc.nextInt();
            v = sc.nextInt();
            int[][] arr = new int[n][3];
            for (int j = 0; j < n; j++) {
                arr[j][0]  = sc.nextInt();
                arr[j][1]  = sc.nextInt();
                arr[j][2]  = sc.nextInt();

            }

            Arrays.sort(arr,(int[] o1, int[] o2)->{
                return o1[2]-o2[2];
            });

            int count = 0;
            for(int k=1;k<=arr[arr.length-1][2];k++){
                int temp = v;
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j][1] <= k&& arr[j][2]>=k){
                        while (temp>=1 && arr[j][0]>=1){
                            count++;
                            temp--;
                            arr[j][0]--;
                        }
                    }
                }
            }
            System.out.println(count);
        }


    }
}
