package com.sort;

import java.util.Arrays;

/**
 * Created by WeihongWu on 2017/10/27.
 */
public class QuickSort {
    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }
    private static void sort(Comparable[] a,int lo,int hi){
        if(lo>=hi) return;
        int j=partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }
    private static int partition(Comparable[] a,int lo,int hi){
        Comparable v=a[lo];
        int i=lo,j=hi+1;
        while(true){
            while(Spopration.less(a[++i],v)) if(i==hi) break;
            while(Spopration.less(v,a[--j])) if(j==lo) break;
            if(i>=j) break;
            Spopration.exchange(a,i,j);

        }
        Spopration.exchange(a,lo,j);
        return j;
    }

    public static void main(String[] args) {
        Comparable[] a=new Integer[]{35,12,98,-3,120};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
