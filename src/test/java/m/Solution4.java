package m;

import java.util.HashMap;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        // 统计数字出现次数
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int num = scanner.nextInt();
            nums[i] = num;
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        // 后半部分开始位置下标
        int start = (n+1)>>1;
        int i=0;
        int count=0;
        while (start<nums.length){
            if (nums[i] != nums[start]){
                count++;
            }
            start++;
            i++;
        }
        System.out.println(count);
    }
}
