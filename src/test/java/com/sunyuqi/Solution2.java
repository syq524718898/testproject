package com.sunyuqi;


import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        int len=0;
        int start=0;
        char preChar = 0;
        for (int i=0;i<chars.length;i++){
            if(chars[i]!=' '){
                start=i;
                preChar=chars[i];
                len=1;
                break;
            }
        }
        for (int i=start+1;i<chars.length;i++){
            if(chars[i]!=' ' &&  chars[i]!=preChar){
                preChar=chars[i];
                chars[start+len]=chars[i];
                len++;
            }
        }
        System.out.println(start);
        System.out.println(len);
        String ans = new String(chars).substring(start, start + len);
        System.out.println(ans);
    }
}
