/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import sorting.randomInt;

/**
 *
 * @author yueliliu
 */
public class Searching {
    public static void main(String[] args) {
//        int[] a = new int[]{5,7,7,12,15,20,21,21,22,23,26,28,29,30,31,34,40,41,42,44,45,48,48,50,53,69,70,73,78,79,80,84,87,88,91,95};
//       int target = 5;
//       System.out.println(BinarySearch.search(a, target));
        
        int target;
        for(int i=0;i<100;i++){
            int[] a = randomInt.get();
            sorting.swap.QuickSort(a);
                for(int j=0;j<101;j++){
                    target = j;
                    int seq = SequenceSearch.search(a, target);
                    int bin = BinarySearch.search(a, target);
                    try{
                        if( seq == bin ){
                      // System.out.printf("Seq: %d is equal to Bin: %d\n",seq, bin);
                        }
                        else{
                            System.out.printf("Target is %d, Seq: %d is not equal to Bin: %d\n",target, seq, bin);
                                    for(int b: a){
                                        System.out.print(b + ",");
                                    }
                                    System.out.println("");
                            
                        }
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
               
        }
        
        
        
    }
    
}
