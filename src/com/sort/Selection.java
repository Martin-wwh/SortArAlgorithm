package com.sort;

import java.util.Arrays;

/**
 * Created by WeihongWu on 2017/10/27.
 */
public class Selection {
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable t=a[i];a[i]=a[j];a[j]=t;
    }
    public static void sort(Comparable[] comparables){
        int N=comparables.length;
        for(int i=0;i<N;i++){
            int min=i;
            for(int j=i+1;j<N;j++){
                if(less(comparables[j],comparables[min])) min=j;
            }
            exch(comparables,i,min);
        }
    }
    public static void main(String[] args) {
	    Integer[] test={2,3,5,1,9,22,13,4,};
	    System.out.println(Arrays.toString(test));
	    sort(test);
	    System.out.print(Arrays.toString(test));
    }
}
