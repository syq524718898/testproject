package m;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        ArrayList<String> ans = new ArrayList<>();
        for (int j=0;j<t;j++){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++){
                int num = scanner.nextInt();
                nums[i] = num;
            }
            if(k>n){
                ans.add("NO");
                continue;
            }
            Arrays.sort(nums);
            if (k==n){
                if (nums[k-1]==n){
                    ans.add("NO");
                }else {
                    ans.add("YES");
                    ans.add(nums[n-1]+1+"");
                }
            }else if(k>0 && nums[k]>nums[k-1]){
                ans.add("YES");
                ans.add(nums[k-1]+1+"");
            }

        }
        for (String an : ans) {
            System.out.println(an);
        }


    }
}