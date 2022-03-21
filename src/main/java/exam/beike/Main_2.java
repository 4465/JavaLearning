package exam.beike;
import java.util.*;
public class Main_2 {
    private static int getSum(int n){
        int sum = 0;
        while (n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        int[] tt = new int[1000001];
        Arrays.fill(tt, 0);
        for(int j=0;j<1000001;j++){
            if(getSum(j) != 0){
                if(j%getSum(j) == 1){
                    tt[j] = 1;
                }
            }
        }

        for (int i = 0; i < T; i++) {
            int ans = 0;
            int left = sc.nextInt();
            int right = sc.nextInt();
            for(int j = left;j<=right;j++){
                if(tt[j] == 1)
                    ans ++;
            }

            System.out.println(ans);
        }
    }
}
