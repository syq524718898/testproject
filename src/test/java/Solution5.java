import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

public class Solution5 {

    int minCos = Integer.MAX_VALUE;



    public int minSailCost (int[][] input) {
        // write code here
        process(input,0,0,0,new HashSet<>());
        if (minCos==Integer.MAX_VALUE)return -1;
        int i = input[0][0] == 1?1:2;

        new ConcurrentHashMap<Integer,Integer>().put(1,2);

        return minCos-i;

    }

    // 来到 i j 位置，之前花费的钱为pre
    // set 用于保存是否走过
    public void process(int[][] input, int i, int j, int pre, HashSet<String> set){
        // 处理越界
        if (i<0 || j<0 || i>=input.length || j>=input.length)return;
        // 走过的路
        if (set.contains(i+"_"+j))return;
        // 走不通
        if (input[i][j]==2)return;
        if (input[i][j]==1){
            pre += 1;
        }else {
            pre += 2;
        }
        // 走到了终点位置
        if (i==input.length-1 && j==input[0].length-1){
            minCos = Math.min(minCos,pre);
            return;
        }
        set.add(i+"_"+j);
        // 此时有四个选择，上下左右
        process(input,i+1,j,pre,set);
        process(input,i,j+1,pre,set);
        process(input,i-1,j,pre,set);
        process(input,i,j-1,pre,set);
    }
}
