package exam.beike;


import java.util.*;
public class Main_3 {
    static   int result=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.nextLine();
        char[] target = sc.nextLine().toCharArray();
        char[][] str_matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            str_matrix[i] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(str_matrix[i][j] == target[0]){
                    if(j<=n-target.length){
                        Main_3.dfs(i,j,true,target,str_matrix);
                    }
                    if(i<=n-target.length){
                        Main_3.dfs(i,j,false,target,str_matrix);
                    }
                }

            }
        }
        System.out.println(Main_3.result);
    }

    public static void dfs(int i, int j, boolean row, char[] target, char[][] matrix){
        if(row){
            for (int k = 0; k < target.length; k++) {
                if(target[k] != matrix[i][j+k]){
                    return;
                }
            }
            Main_3.result++;
        }else{
            for (int k = 0; k < target.length; k++) {
                if(target[k]!=matrix[i+k][j]){
                    return;
                }
            }
            Main_3.result++;
        }
    }
}
