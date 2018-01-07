package com.company;

import java.util.Random;

public class QuickSort {
    Saver[] ss ;

    public QuickSort(Saver[] ss) {
        this.ss = ss;
    }

    public Saver[] Fsort() {

        int low = 0;
        int high = ss.length - 1;
        quickSort(ss, low, high);
        return ss;
    }

    private void quickSort(Saver[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        Random rand = new Random();
        int middle = rand.nextInt((high - low) + 1 ) + low;
        //int middle = low + (high - low) / 2;

        int pivot = arr[middle].weight;
        int i = low, j = high;
        while (i <= j) {
            while (arr[i].weight < pivot) {
                i++;
            }
            while (arr[j].weight > pivot) {
                j--;
            }
            if (i <= j) {
                Saver temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }
    }
}
