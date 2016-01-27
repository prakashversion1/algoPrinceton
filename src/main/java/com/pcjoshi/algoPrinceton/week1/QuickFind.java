package com.pcjoshi.algoPrinceton.week1;

/**
 * Created by prakash on 1/26/16 for algoPrinceton Please contact prakashjoshiversion1@gmail.com
 */
public class QuickFind {
    private int count;
    private int[] id;

    public QuickFind(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int a, int b) {
        return id[a] == id[b];
    }

    //(Connect 4 and 3 mens change  )
    public void union(int a, int b) {
        int p = id[a];
        int q = id[b];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == p) {
                id[i] = q;
            }
        }
        count--;
    }

    public int count() {
        return count;
    }
}
