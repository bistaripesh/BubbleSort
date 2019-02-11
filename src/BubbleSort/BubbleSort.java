package BubbleSort;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ripesh
 */
public class BubbleSort {
    public static void  main (String [] args){
     int a []={2,5,7,9,3,4,23,65,87,432,12,43};
     for (int i=0;i<a.length;i++){
         for (int j=i+1;j<a.length;j++){
             if (a[j]<a[i]){
                 int temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
         }
     }
     for (int k:a){
         System.out.println(k);
     }
    }
}
