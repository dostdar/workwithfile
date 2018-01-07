package com.company;

public class Saver {
    int weight;
    int start;
    int end;

    public Saver(int s, int e , int w) {
       weight = w ;
       start = s;
       end = e;
    }

    @Override
    public String toString() {
        return "Saver{" +
                "weight=" + weight +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
