package com.company.guanglianda;



import java.util.Arrays;
import java.util.Scanner;

/*数字数码管

数字或字母可以用7位数码管显示（就是排列为8字形的7个数码管）

       @@@@           0
     @      @       1   2
     @      @         3
       @@@@         4   5
     @      @         6
     @      @
       @@@@

对于大型灯管，为了节约使用，在切换数字的时候，如果该灯管的状态没有改变，则不需要对该灯管关了再开。
已知一个数字变化的系列，求7个数码管开关的动作。

3：0,2,3,5,6
6：0,1,4,6,5,3
*/
public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数字序列(用逗号分隔)：");
        String str = sc.nextLine();

        String str2[] = new String[str.length() + 1];
        str2[0] = "-1";
        for (int i = 1; i < str2.length; i++) {
            str2[i] = String.valueOf(str.charAt(i-1));
        }

        System.out.println(Arrays.toString(str2));

        int ans = 0;
        for(int i=0;i<str2.length-1;i++){

            for(int k=0;k<7;k++){
                if(showNumber(Integer.valueOf(str2[i+1]))[k]!=showNumber(Integer.valueOf(str2[i]))[k]){

                    ans++;
                }
            }

        }
        System.out.println(ans);
    }

    //数字数码管显示方法，参数为要显示的数字
    public static int[] showNumber(int a){
        int []n = {0,0,0,0,0,0,0};
        switch (a) {
            case 0:
                n[0]=1;n[1]=1;n[2]=1;n[4]=1;n[5]=1;n[6]=1;
                break;
            case 1:
                n[2]=1;n[5]=1;
                break;
            case 2:
                n[0]=1;n[2]=1;n[3]=1;n[4]=1;n[6]=1;
                break;
            case 3:
                n[0]=1;n[2]=1;n[3]=1;n[5]=1;n[6]=1;
                break;
            case 4:
                n[1]=1;n[2]=1;n[3]=1;n[5]=1;
                break;
            case 5:
                n[0]=1;n[1]=1;n[3]=1;n[5]=1;n[6]=1;
                break;
            case 6:
                n[0]=1;n[1]=1;n[3]=1;n[4]=1;n[5]=1;n[6]=1;
                break;
            case 7:
                n[0]=1;n[2]=1;n[5]=1;
                break;
            case 8:
                n[0]=1;n[1]=1;n[2]=1;n[3]=1;n[4]=1;n[5]=1;n[6]=1;
                break;
            case 9:
                n[0]=1;n[1]=1;n[2]=1;n[3]=1;n[5]=1;n[6]=1;
                break;
            default:
                break;
        }
        return n;
    }
}