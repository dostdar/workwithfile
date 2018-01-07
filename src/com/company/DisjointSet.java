package com.company;

		//sina ebrahimi data strucher project


public class DisjointSet {
    int[] parent ;
    int count ;
    public DisjointSet(int count) {
        this.count = count;
        parent = new int[count];
        makeSet();
    }

    private void makeSet() {
        for (int i = 0; i < count; i++) {
            parent[i] = i;
        }
    }

    public int findset(int find) {
        if (parent[find] == find) {
            return find;
        }
        return findset(parent[find]);
    }

    public void union(int a, int b) {
        int ap ,bp ;
        ap = findset(a);
        bp = findset(b);
        parent[ap] = bp ;
    }
}
