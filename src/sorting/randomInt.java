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
public class randomInt {
    public static int[] get(){
        int count = 100000;
        int[] random = new int[count];
        for(int i=0;i<random.length;i++){
            int num = (int) (Math.random() * 100);
        
            //System.out.println(num);
            random[i] = num;
        }
//        for(int b: random){
//            System.out.print(b + ",");
//        }
//        System.out.println("");
        return random;
    }
}
