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
public class Searching {
    public static void main(String[] args){
        int[] a = new int[]{56,12,47,95,93,90,31,83,80,89,65,26,2};
        int target = 56;
        boolean bingo = SequenceSearch.search(a, target);
        System.out.println(bingo);
    }
    
}
