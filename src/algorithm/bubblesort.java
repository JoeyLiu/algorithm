/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

/**
 *
 * @author yueliliu
 */
public class bubblesort {
    public static void sort(int[] a){
        int length = a.length;
       
        for(int i=length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int b: a){
            System.out.print(b + ",");
        }
        System.out.println("");
    }
}
