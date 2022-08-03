
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // 获取输入
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] split = str.split(" ");
        int m = scanner.nextInt();
        int count=0;
        int[] nums = new int[split.length];
        for (int i=0;i<nums.length;i++){
            nums[i] = Integer.valueOf(split[i]);
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]>=m){
                break;
            }
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]<=m){
                    count++;
                }else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
