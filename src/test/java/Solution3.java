import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        // 获取输入
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if ("".equals(str)){
            System.out.println(0);
            return;
        }
        String[] split = str.split(" ");
        int count=1;
        int left=1;
        for(int i=1;i<split.length;i++){
            if(Integer.valueOf(split[i])>Integer.valueOf(split[i-1])){
                left++;
                count+=left;
            }else {
                if (i+1 < split.length && Integer.valueOf(split[i])>Integer.valueOf(split[i+1])){
                    count+=3;
                    i++;
                }else {
                    count+=1;
                }
                left=1;
            }
        }
        System.out.println(count);
    }
}
