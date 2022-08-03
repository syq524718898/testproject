package suanfa;

public class fastSort {

    public static void main(String[] args) {
        int[] ints = {4, 1, 2, 54, 32, 5, 7, 90};
        fastsort(ints,0,ints.length-1);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static void fastsort(int[] nums,int left,int right){
        if (left>=right)return;
        int i = left;
        int j = right;
        while (left<right){
            while (left<right && nums[left]<=nums[right]){
                left++;
            }
            swap(nums,left,right);
            while (left<right && nums[left]<=nums[right]){
                right--;
            }
            swap(nums,left,right);
        }
        fastsort(nums,i,left-1);
        fastsort(nums,left+1,j);
    }

    public static void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
