/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author yueliliu
 */
public class InsertSearch {
    public static int search(int[] a, int target){
        //sorting.swap.QuickSort(a);
        int len = a.length;
        int low = 0;
        int high = len-1;
        int mid = 0;
        
        if(len == 0) return -1;
        while(low <= high){
            if(target < a[low] || target > a[high]) return -1;
            if( low == high || a[low] == a[high]) {
                mid = low;
            }
            else{
                mid = low + (target-a[low])/(a[high] - a[low])*(high-low)/2;
            }
            //if( low != high && a[low] != a[high]) 
            if( target == a[mid]) return mid;
            if( target > a[mid]) low++;
            if( target < a[mid]) high--;
        }
        
        return -1;
    }
}
