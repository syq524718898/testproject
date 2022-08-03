package m;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Solution5 {

    static class Node{
        int value;
        Node left;
        Node right;
        Node(int v){
            this.value=v;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 节点数量 编号从1到n
        int n = scanner.nextInt();
        // 左右子树交换次数
        int m = scanner.nextInt();
        // 根节点编号
        int k = scanner.nextInt();
        HashMap<Integer, Node> map = new HashMap<>();
        // 构建二叉树
        for (int i=1;i<n+1;i++){
            map.put(i,new Node(i));
        }
        for (int i = 1; i < n+1; i++) {
            // 左节点
            int left = scanner.nextInt();
            // 右节点
            int right = scanner.nextInt();
            Node node = map.get(i);
            if (left!=0){
                node.left = map.get(left);
            }
            if(right!=0){
                node.right = map.get(right);
            }
        }
        // 调换
        for (int i=0;i<m;i++){
            int flag = scanner.nextInt();
            Node root = map.get(flag);
            Node node = root.left;
            root.left = root.right;
            root.right = node;
        }

        // 打印结果
        ArrayList<Integer> ans = new ArrayList<>();
        process(map.get(k),ans);
        for (Integer an : ans) {
            System.out.printf("%d ",an);
        }

    }

    // 中序遍历
    private static void process(Node root,ArrayList<Integer> ans){
        if(root==null)return;
        process(root.left,ans);
        ans.add(root.value);
        process(root.right,ans);
    }
}
