package com.company.netstat;

import java.util.*;

public class Main_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T  = sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < T; j++) {
            LinkedList<LinkedList<Integer>> list = new LinkedList<>();
            HashMap<String, LinkedList> map = new HashMap<>();
            for (int i = 0; i < 6; i++) {
                String[] params = sc.nextLine().trim().split(" ");
                String name = params[0];
                int points = Integer.parseInt(params[1]);
                int goals_for = Integer.parseInt(params[2]);
                int goals_aganist = Integer.parseInt(params[3]);
                int goals = goals_for - goals_aganist;
                LinkedList<Integer> l = new LinkedList<>();
                l.add(points);
                l.add(goals_for);
                l.add(goals_aganist);
                l.add(goals);
                if(!map.containsKey(name)){
                    map.put(name, l);
                }
            }


            for(Map.Entry<String, LinkedList> m : map.entrySet()){
                System.out.println(m.getKey() + ":" + Arrays.toString(m.getValue().toArray()));
            }

            for (int i = 0; i < 3; i++) {
                String[] params = sc.nextLine().trim().split(" ");
                String name1 = params[0];
                String name2 = params[1];
                int goals1 = Integer.parseInt(params[2]);
                int goals2 = Integer.parseInt(params[3]);
                LinkedList<Integer> lt = map.get(name1);
                lt.set(1, lt.get(1) + goals1);
                lt.set(2, lt.get(2) + goals2);
                lt.set(3, lt.get(1) - lt.get(2));


                LinkedList<Integer> lte = map.get(name2);
                lte.set(1, lte.get(1) + goals2);
                lte.set(2, lte.get(2) + goals1);
                lte.set(3, lte.get(1) - lte.get(2));

                if(goals1 > goals2){
                    lt.set(0, lt.get(0) + 3);
                } else if(goals1 == goals2){
                    lt.set(0, lt.get(0) + 1);
                    lte.set(0, lte.get(0) + 1);
                }else {
                    lte.set(0, lte.get(0) + 3);
                }
            }

            System.out.println("==================================");
            for(Map.Entry<String, LinkedList> m : map.entrySet()){
                System.out.println(m.getKey() + ":" + Arrays.toString(m.getValue().toArray()));
            }
            System.out.println("==================================");
            HashMap<Integer, String> mm = new HashMap<>();

            int id = 0;
            LinkedList<LinkedList<Integer>> List = new LinkedList<>();
            for(Map.Entry<String, LinkedList> m : map.entrySet()){

                mm.put(id, m.getKey());
                LinkedList<Integer> temp = m.getValue();
                temp.add(0, id++);

                List.add(temp);

            }

            Collections.sort(List, new Comparator<LinkedList<Integer>>() {
                @Override
                public int compare(LinkedList<Integer> o1, LinkedList<Integer> o2) {
                    if(o1.get(1) == o2.get(1)){
                        if(o1.get(4) == o2.get(4)){
                            if(o1.get(2) == o2.get(2)){
                                int i = mm.get(o2.get(0)).compareTo(mm.get(o1.get(0)));
                                return i;
                            }
                            return o2.get(2) - o1.get(2);
                        }
                        return o2.get(4) - o1.get(4);
                    }
                    return o2.get(1) - o1.get(1);
                }
            });

            System.out.println("==================Result===============================");
            for (int i = 0; i < List.size(); i++) {
                System.out.println(mm.get(List.get(i).get(0)) + " " + List.get(i).get(1) + " " + List.get(i).get(2) + " " + List.get(i).get(3));

            }
            System.out.println("END");
        }
    }
}




