package com.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/10/27.
 */
public class HeapSort {
    private static void exch(Comparable[] a,int i,int j){
        Comparable v=a[i-1];
        a[i-1]=a[j-1];
        a[j-1]=v;
    }
    private static boolean less(Comparable[] a,int i,int j){
        return a[i-1].compareTo(a[j-1])<0;
    }
    public static void sink(Comparable[] a,int k,int N){
        while(2*k<=N) {
            int j = 2 * k;
            if (j < N && less(a, j, j + 1)) j++;
            if (!less(a, k, j)) break;
            exch(a, k, j);
            k = j;
        }
    }
    public static void sort(Comparable[] a){
        int N=a.length;
        for(int i=N/2;i>=1;i--){
            sink(a,i,N);
        }
        while(N>1){
            exch(a,1,N--);
            sink(a,1,N);
        }
    }
    public static void main(String[] args){
        String s[]=new String[]{"ad","fc","sc","ek"};
        sort(s);
        System.out.println(Arrays.toString(s));
    }
}
