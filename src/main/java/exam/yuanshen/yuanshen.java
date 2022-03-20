package exam.yuanshen;
import java.util.*;


class ShenWu{
    public int aValue;
    public int bValue;
    public ShenWu(int aValue, int bValue){
        this.aValue = aValue;
        this.bValue = bValue;
    }
}

public class yuanshen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q;
        q = sc.nextInt();
        sc.nextLine();
        LinkedList<ShenWu> list = new LinkedList<>();
        for (int i = 0; i < q; i++) {
            String[] params = sc.nextLine().split(" ");
            if(params.length>1){
                //掉落物品
                list.offer(new ShenWu(Integer.parseInt(params[1]), Integer.parseInt(params[2])));
            }
            else{
                if(list.isEmpty()){
                    System.out.println("no reliquaries.");
                }
                else {
                    ShenWu s = list.poll();
                    System.out.println(s.aValue + " " + s.bValue);
                }
            }
        }
    }
}
