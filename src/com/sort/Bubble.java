package com.sort;

import java.util.Arrays;

/**
 * Created by WeihongWu on 2017/10/27.
 */
public class Bubble {

    public static void sort(Comparable[] a){
        int N=a.length;
        for(int i=0;i<N-1;i++){
            for(int j=0;j<N-i-1;j++){
                if(!Spopration.less(a[j],a[j+1])) Spopration.exchange(a,j,j+1);
            }
        }
    }
    public static void main(String[] args){
        Comparable[] a=new Integer[]{-3,4,12,45,848,-11};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
