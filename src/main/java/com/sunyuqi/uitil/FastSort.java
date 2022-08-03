package com.sunyuqi.uitil;

public class FastSort {

    public static void fastsort(int[] ids,int left,int right)
    {
        if(left>=right)return;
        int i = left;
        int j = right;
        int mid = ids[left];
        while(i<j)
        {
            while(i<j && ids[j]>=mid)
            {
                j--;
            }
            swap(ids,i,j);
            while(i<j && ids[i]<=mid)
            {
                i++;
            }
            swap(ids,i,j);
        }
        fastsort(ids,left,i-1);
        fastsort(ids,i+1,right);
    }

    public static void swap(int[] ids,int left,int right)
    {
        int tmp = ids[right];
        ids[right] = ids[left];
        ids[left] = tmp;
    }
}
