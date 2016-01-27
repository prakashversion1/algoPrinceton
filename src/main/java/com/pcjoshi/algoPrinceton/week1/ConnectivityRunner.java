package com.pcjoshi.algoPrinceton.week1;

import java.io.FileInputStream;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by prakash on 1/26/16 for algoPrinceton Please contact prakashjoshiversion1@gmail.com
 */
public class ConnectivityRunner {
    public static void main(String[] args) {
        String inputPath = "/home/pcjoshi/Documents/dummyProjects/princetonData/week1/tinyUF.txt";
        try {
            System.setIn(new FileInputStream(inputPath));
            int N = StdIn.readInt();
            Stopwatch timer = new Stopwatch();
            quickFind(N);
            System.out.println("Time eclapsed is : " + timer.elapsedTime()*60 +" seconds");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public static void quickFind(int N) {
        QuickFind quickFind = new QuickFind(N);
        while (!StdIn.isEmpty()) {
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            if (!quickFind.connected(a, b)) {
                quickFind.union(a, b);
                System.out.println("Union of : " + a + " " + b);
            }
        }
        System.out.println(quickFind.count() + " connected components.");
    }

    public static void quickUnion(int N) {
        QuickUnion quickUnion = new QuickUnion(N);
        while (!StdIn.isEmpty()) {
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            if (!quickUnion.connected(a, b)) {
                quickUnion.union(a, b);
                System.out.println("Union of : " + a + " " + b);
            }
        }
        System.out.println(quickUnion.count() + " connected components.");
    }
}
