package com.pcjoshi.algoPrinceton.week1;

import edu.princeton.cs.introcs.StdIn;

/**
 * Created by prakash on 1/26/16 for algoPrinceton Please contact prakashjoshiversion1@gmail.com
 */
public class ConnectivityRunner {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        QuickFind quickFind = new QuickFind(N);
        while (!StdIn.isEmpty()){
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            if (!quickFind.connected(a,b)){
                quickFind.union(a,b);
                System.out.println("Union of : " + a +" - " + b);
            }
        }
        System.out.println(quickFind.count()+" connected components.");

    }
}
