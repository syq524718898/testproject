package com.sunyuqi;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
//        System.out.println(reverse(1234));

        StringBuilder builder = new StringBuilder();
        builder.append('2');
        builder.append('3');
        builder.append('4');
        System.out.println(builder.toString());
        builder.delete(2,3);
        System.out.println(builder.toString());
    }

    public static int reverse(int x){
        int rev=0;
        while(rev>=Integer.MIN_VALUE/10 && rev<=Integer.MAX_VALUE/10 && x!=0){
            int digist=x%10;
            x=x/10;
            rev=rev*10+digist;
        }
        if(x!=0)return 0;
        else return rev;

    }
}
