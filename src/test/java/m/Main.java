package m;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static HashMap<Integer,Object> map = new HashMap<>();

    public static ArrayList<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0;i<n;i++){
            int t = scanner.nextInt();
            // 联盟关系
            if (t==1){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if(map.containsKey(a)){
                    map.put(b,map.get(a));
                }else if(map.containsKey(b)){
                    map.put(a,map.get(b));
                }else{
                    Object object=new Object();
                    map.put(a,object);
                    map.put(b,object);
                }
                // 判断是否是联盟
            }else if(t==2){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int ac = a%c;
                int bc = b%c;
                if(ac==bc){
                    ans.add("YES");
                    continue;
                }
                if(map.containsKey(ac) && map.containsKey(bc)){
                    if(map.get(ac)==map.get(bc)){
                        ans.add("YES");
                    }else{
                        ans.add("NO");
                    }
                }else{
                    ans.add("NO");
                }
            } else {
                ans.add("NO");
            }
        }
        for (String an : ans) {
            System.out.println(an);
        }
    }

}
