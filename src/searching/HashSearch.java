/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author yueliliu
 */
public class HashSearch {
    public static int search(int[] a, int target){
        int len = a.length;
        Map hash = new HashMap();
        for(int i: a){
            hash.put(i, i);
        }
        try{
            return (int)hash.get(target);
        }
        catch(NullPointerException e){
            return -1;
        }
        
    }
    
}
