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
public class SequenceSearch {
    public static int search(int[] a, int target){
        int len = a.length;
        //boolean bingo = false;
        for(int i=0;i<len;i++){
            if(a[i] == target){
                return i;
            }
        }
        return -1;
    }
    
}
