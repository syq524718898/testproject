package com.sunyuqi.pojo;

import java.util.ArrayList;
import java.util.Arrays;

public class Result {

    private int[] list;

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Result{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}
