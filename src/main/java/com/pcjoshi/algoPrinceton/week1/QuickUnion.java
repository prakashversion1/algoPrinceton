package com.pcjoshi.algoPrinceton.week1;

/**
 * Created by prakash on 1/27/16 for algoPrinceton Please contact prakashjoshiversion1@gmail.com
 */
public class QuickUnion {
    private int[] id;
    private int count;

    public QuickUnion(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public void union(int a, int b) {
        // union would mean change a to b
        int i = root(a);
        int j = root(b);
        id[i] = j;
        count--;
    }

    public boolean connected(int a, int b) {
        return root(a) == root(b);
    }

    // this method throws stackoverflow exception
//    public int root(int x) {
//        if (id[x] == x)
//            return x;
//        else
//            return root(id[x]);
//    }

    public int root(int x){
        while (id[x]!=x) x = id[x];
        return  x ;
    }

    public int count() {
        return count;
    }
}
