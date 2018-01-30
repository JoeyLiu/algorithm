/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

/**
 *
 * @author damaomao
 */
public class merge {
    public static void sort(int[] a){
        int[] temp = new int[a.length];
        MergeSort(a, 0, a.length-1, temp);
        for(int b: temp){
            System.out.print(b + ",");
        }
        System.out.println("");
    }
    private static void MergeSort(int[] a, int first, int last, int[] temp){
        if(first < last){
            int mid = (first + last)/2;
            MergeSort(a, first, mid, temp);
            MergeSort(a, mid+1, last, temp);
            Merge(a, first, last, temp);
        }       
    }
    private static void Merge(int[] a,int first, int last, int[] temp){
        int mid = (first + last)/2;
        final int  MIDDLE = mid;
        final int FIRST = first;
        int i=0;
        while(first <= MIDDLE && (mid+1) <= last){
            if(a[first] <= a[mid+1]) {
                temp[i] = a[first];
                i++;
                first++;
            }
            else{
                temp[i] = a[mid+1];
                i++;
                mid++;
            }
        }
        while(first <= MIDDLE){
            temp[i] = a[first];
                i++;
                first++;
        }
        while((mid+1) <= last){
            temp[i] = a[mid+1];
            i++;
            mid++;
        }
        for(int j=0;j<i;j++){
            a[FIRST + j] = temp[j];
        }
        
    }
}
