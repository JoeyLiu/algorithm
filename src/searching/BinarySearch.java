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
    public static int search(int a[], int target){
        
        int len = a.length;
        if(len == 0) return -1;
        
        int first = 0;
        int last  = len-1;
        
        while(first <= last){
            int mid = (last+first)/2;
            if(target == a[mid]) return mid;
            if(target > a[mid]) first = mid+1; 
            if(target < a[mid]) last = mid-1;          
        }
        return -1;
    }
}
