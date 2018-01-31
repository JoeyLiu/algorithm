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
public class BinarySearch {
    public static boolean search(int a[], int target){
        sorting.swap.QuickSort(a);
        int len = a.length;
        if(len == 0) return false;
        if(len == 1 && target == a[0]){
            return true;
        }
        if (target == a[0] || target == a[len-1]){
                return true;
            }
        int first = 0;
        int last  = len;
        int mid = (last+first)%2 == 0?(last+first)/2:(last+first)/2+1;
        while((last-first) > 1){
            if (target == a[mid-1]){
                return true;
            }
            if(target > a[mid-1]){
                
                first = mid;
                
                mid = (last+mid)%2 == 0?(last+mid)/2:(last+mid)/2+1;
                
            }
            else{
                last = mid;
                
                mid = (first+mid)%2 == 0?(first+mid)/2:(first+mid)/2+1;
            }
        }
        
 
        return false;
    }
}
