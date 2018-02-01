/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author damaomao
 */
public class sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            for(int i=0;i<10;i++){
                int[] a = randomInt.get();
                long begin = System.currentTimeMillis();
                merge.sort((int[])a.clone());
                long m1 = System.currentTimeMillis();
                 swap.QuickSort((int[])a.clone());
                 long m2 = System.currentTimeMillis();
                 selection.simpleSelectionSort((int[])a.clone());
                 long m3 = System.currentTimeMillis();
                swap.BubbleSort((int[])a.clone());
                long m4 = System.currentTimeMillis();
                insert.StraightInsertSort((int[])a.clone());
                long m5 = System.currentTimeMillis();
       System.out.printf("Merge: (%d), Quick: (%d), simpleSelection: (%d), Bubble: (%d), StraightInsert: (%d)\n",m1-begin, m2-m1,m3-m2,m4-m3,m5-m4);
//                if(!check_sort(a)){
//                    throw new Exception("a false occurs");
//                }
            }
        }
        catch (Exception e){
           e.printStackTrace();
       }        
        
    }
    private static boolean check_sort(int[] a){
        
        for(int i=0;i<a.length-1;i++){
            if(a[i] > a[i+1]) {
                return false;              
            }
        }
        return true;
    }
    
}
