package com.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/9/13.
 */
public class Insertion {
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable t=a[i];a[i]=a[j];a[j]=t;
    }
    public static void sort(Comparable[] a){
        int N=a.length;
        for(int i=1;i<N;i++){
            for (int j=i;j>0&&less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }
    public static void main(String args[]){
        Integer[] test={2,35,3,65,20,13};
        System.out.println(Arrays.toString(test));
        sort(test);
        System.out.print(Arrays.toString(test));
    }
}
