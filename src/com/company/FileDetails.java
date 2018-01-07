package com.company;

//sina ebrahimi data structure project

public class FileDetails {
    int numberofvertex;
    int numberofyal;
    Saver[] yals;
    Saver[] sortedyals;

    public FileDetails(int numberofvertex, int numberofyal, Saver[] yals) {
        this.numberofvertex = numberofvertex;
        this.numberofyal = numberofyal;
        this.yals = yals;
        QuickSort qs = new QuickSort(yals);
        sortedyals = qs.Fsort();
    }

    public int getNumberofvertex() {
        return numberofvertex;
    }

    public int getNumberofyal() {
        return numberofyal;
    }

    public Saver[] getYals() {
        return yals;
    }

    public Saver[] getSortedyals() {
        return sortedyals;
    }
}
