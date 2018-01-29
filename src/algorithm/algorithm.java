/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import static algorithm.quicksort.quicksort;



/**
 *
 * @author damaomao
 */
public class algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] a = randomInt.get();
//          int[] a = new int[]{34,17,7,13,22,74,9,85,17,85,6,50,56,87,65,66,42,28};
//                  for(int b: a){
//            System.out.print(b + ",");
//        }
//        System.out.println("");
        quicksort(a);
       // simpleSelection.sort(a);
        System.out.println(check_minmum(a));
    }
    private static boolean check_minmum(int[] a){
        boolean min = true;
        for(int i=0;i<a.length-1;i++){
            if(a[i] > a[i+1]) {
                return false;
                
            }
        }
        return true;
    }
    
}
