public class Solution2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 返回Sn的第k位字符
     * @param n int整型 Sn的n
     * @param k int整型 需要返回的字符下标位
     * @return char字符型
     */
    public char findKthBit (int n, int k) {
        // write code here
        if (n==1){
            return 'a';
        }else if (n==2){
            return "abz".charAt(k-1);
        }else if (n==3){
            return "abzcayz".charAt(k-1);
        }else if (n==4 || k<=15){
            return "abzcayzdabzxayz".charAt(k-1);
        }

        int minN = 4;
        int minCount = 15;
        while (minN<n){
            minN++;
            minCount = 2*minCount + 1;
            if (minCount>=k)break;
        }
        String str="abzcayzdabzxayz";
        for (int i=5;i<=minN;i++){
            str = process(str,i);
        }

        return str.charAt(k-1);
    }

    // 处理
    public String process(String str,int n){
        String newStr = str + (char)(96+1);
        StringBuilder builder = new StringBuilder();
        for (int i=str.length()-1;i>=0;i--){
            builder.append(invert(str.charAt(i)));
        }
        return newStr+builder.toString();
    }

    public char invert(char c){
        int num = c-'a';
        return (char)(122-num);
    }
}
