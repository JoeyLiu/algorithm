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
public class Bots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = new int[]{8,7,1,4,9,5,2,3,6,11,15,10,8,12};
        quick(0,(a.length-1), a);
        for(int b: a){
            System.out.println(b);
        }
        
    }
             static void quick(int left, int right, int[] array){
             if(left >= right) {
                 
                 return;
             }
             
             int key = array[left];
             int low = left;
             int high = right;
             int temp;
             
             while(low < high){
             while(low < high && array[high] >= key) high--;
             if(low < high){
             temp = array[low];
             array[low] = array[high];
             array[high] = temp;
            } 
                           
             while(low < high && array[low] <= key) low++;
              if(low < high){
             temp = array[high];
             array[high] = array[low];
             array[low] = temp;
             } 
             }
             
             System.out.println(";" + left + "," + low);
             quick(left, low-1, array);
             quick(low+1, right, array);
         }
}
