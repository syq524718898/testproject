package m;

import java.util.*;

public class Solution1 {

    static List<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        generateParenthesis(2);
//        ans.forEach(System.out::println);
        System.out.println(ans.size());

    }

    public static List<String> generateParenthesis(int n) {
        process(0,n,0,0,new StringBuilder());
        return ans;
    }
    static void process(int i,int n,int left,int right,StringBuilder stringBuilder){
        if (right>left)return;
        if(i==n) {
            if (left==right){
                ans.add(new String(stringBuilder));
            }
            return;
        }
        stringBuilder.append('(');
        process(i+1,n,left+1,right,stringBuilder);
        stringBuilder.deleteCharAt(i);
        stringBuilder.append(')');
        process(i+1,n,left,right+1,stringBuilder);
        stringBuilder.deleteCharAt(i);

    }
}
