package m;

import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        Deque<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(nums[0]);
        int ans=0;
        for (int i=1;i<n;i++){
            while (!queue.isEmpty()){
                if(queue.getLast()<nums[i]){
                    ans+=queue.getLast()*(i+1);
                    queue.add(nums[i]);
                    break;
                }else {
                    stack.push(queue.pollLast());
                }
            }
            while (!stack.empty()){
                queue.add(stack.pop());
            }
        }
        System.out.println(ans);

    }
}
