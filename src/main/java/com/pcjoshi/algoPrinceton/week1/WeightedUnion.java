package com.pcjoshi.algoPrinceton.week1;

import java.util.Arrays;

/**
 * Created by prakash on 1/28/16 for algoPrinceton Please contact prakashjoshiversion1@gmail.com
 */
public class WeightedUnion {
    private int [] id;
    private int [] weight;
    private int count;

    public WeightedUnion(int N){
        id = new int[N];
        weight = new int[N];
        count = N;
        for (int i = 0; i<N ; i++){
            id[i]= i;
            weight[i] = 1;
        }
    }

    public boolean connected(int a, int b){
        return root(a) == root(b);
    }

    public int root(int a){
        while (id[a] != a){
            a = id[a];
        }
        return a;
    }

    public void union(int a,int b){
        int p = root(a);
        int q = root(b);
        if (weight[p] > weight[q]) {
            id[q] = root(p) ;
            weight[q] += weight[p];
        }
        if (weight[p] < weight[q]){
            id[p] = root(q);
            weight[p] += weight[q];
        }
        if (weight[p] == weight[q]){
            id[p] = root(q);
            weight[p] += weight[q];
        }
//        System.out.println("New main array is : " + Arrays.toString(id));
//        System.out.println("Weight array is : " + Arrays.toString(weight));
        count --;
    }

    public int count(){
        return count;
    }
}
