package com.sort;
import java.awt.*;
import java.util.Arrays;

/**
 * 自底向上的归并排序
 * @author Weihong Wu
 * @create 2018--02--03 0:57
 **/
public class BUMerge {
    private static Color color = new Color(30, 55, 31);
    private static Comparable[] aux;
    private static void merge(Comparable[] a,int lo,int mid,int hi){
        int i=lo,j=mid+1;
        for(int k=lo;k<=hi;k++){
            aux[k]=a[k];
        }
        for(int k=lo;k<=hi;k++){
            if(i>mid) a[k]=aux[j++];
            else if(j>hi) a[k]=aux[i++];
            else if(Spopration.less(aux[i],aux[j])) a[k]=aux[i++];
            else a[k]=aux[j++];
        }
    }
    public static void sort(Comparable[] a){
        int N=a.length;
        aux=new Comparable[N];
        for(int size=1;size<N;size=size+size){
            for(int lo=0;lo<N-size;lo+=size+size){
                merge(a,lo,lo+size-1,Math.min(lo+size+size,N-1));
            }
        }
    }

    public static void main(String[] arg) {
        Comparable[] a=new Integer[]{-3,4,-1,24,22,456,-12,89};
        sort(a);
        System.out.println(Arrays.toString(a));

    }
}
