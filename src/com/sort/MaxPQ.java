package com.sort;

/**
 * Created by Administrator on 2017/10/27.
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N=0;
    public MaxPQ(int MaxN){
        pq=(Key[])new Comparable[MaxN+1];
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    private boolean less(int i,int j){
        return pq[i].compareTo(pq[j])<0;
    }
    private void exch(int i,int j){
        Key v=pq[i];
        pq[i]=pq[j];
        pq[j]=v;
    }
    public void swim(int k){
        while(k>1&&less(k/2,k)){
            exch(k/2,k);
            k=k/2;
        }
    }
    public void sink(int k){
        while(2*k<=N){
            int j=2*k;
            if(j<N&&less(j,j+1)) j++;
            if(!less(k,j)) break;
            exch(k,j);
            k=j;
        }
    }
    public void insert(Key v){
        pq[++N]=v;
        swim(N);
    }
    public Key deleteMax(){
        exch(1,N);
        Key max=pq[N--];
        pq[N+1]=null;
        sink(1);
        return max;
    }
    public static void main(String[] args){
        MaxPQ<Integer> maxPQ=new MaxPQ<>(6);
        maxPQ.insert(4);
        maxPQ.insert(2);
        maxPQ.insert(39);
        maxPQ.insert(21);
        maxPQ.insert(11);
        maxPQ.insert(44);
        for(int i=1;i<=6;i++) {
            System.out.print(maxPQ.deleteMax() + "\t");
        }
    }
}
