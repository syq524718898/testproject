public class Solution4 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 计算最小航行费用
     * @param input int整型二维数组 二维网格
     * @return int整型
     */
    public int minSailCost (int[][] input) {
        // write code here
        int row = input.length;
        int col = input[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = 0;
        // 填充第一行
        for (int i=1;i<col;i++){
            if (input[0][i]==2){
                dp[0][i] = -1;
            }else {
                if (input[0][i-1]==2){
                    dp[0][i] = -1;
                    break;
                }else {
                    if (input[0][i]==1){
                        dp[0][i] = dp[0][i-1]+1;
                    }else {
                        dp[0][i] = dp[0][i-1]+2;
                    }
                }
            }
        }

        // 填充第一列
        for (int i=1;i<row;i++){
            if (input[i][0]==2){
                dp[i][0] = -1;
            }else {
                if (input[i-1][0]==2){
                    dp[i][0] = -1;
                    break;
                }else {
                    if (input[i][0]==1){
                        dp[i][0] = dp[i-1][0]+1;
                    }else {
                        dp[i][0] = dp[i-1][0]+2;
                    }
                }
            }
        }

        for (int i=1;i<row;i++){
            for (int j=1;j<col;j++){
                if (input[i][j]==2){
                    dp[i][j]=-1;
                }else {
                    int cur = input[i][j] == 1 ? 1:2;
                    if (dp[i-1][j]!=-1 && dp[i][j-1] != -1){
                        dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+cur;
                    }else if (dp[i-1][j]!=-1){
                        dp[i][j] = dp[i-1][j] + cur;
                    }else if (dp[i][j-1]!=-1){
                        dp[i][j] = dp[i][j-1] + cur;
                    }else {
                        dp[i][j] = -1;
                    }
                }
            }
        }

        return dp[row-1][col-1];
    }


}
