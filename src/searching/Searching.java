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
        run();
        
        
        
    }
    private static void run(){
        for(int i=0;i<100;i++){
            int[] a = randomInt.get();
            sorting.swap.QuickSort(a);
                for(int j=0;j<101;j++){
                    int target = j;
                    int seq = SequenceSearch.search(a, target);
                    int bin = BinarySearch.search(a, target);
                    int hash = HashSearch.search(a, target);

                    try{
                        if( seq == -1 ){
                             if(bin != -1 || hash != -1){
                                 throw new Exception("Binary: " + bin + "Hash: " + hash);
                             }
                        }
                        else{
                            System.out.printf("Target is: %d Hash is: %d Seq is: %d Binary is: %d\n", target, hash, seq, bin);
                        }
                        
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
               
        }
    }
    
}
