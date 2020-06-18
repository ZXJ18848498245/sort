package com.test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class redixSort {
    public static void  redixSort(String [] arr,int stringlen){
        final int BUCKETS =256;
        ArrayList<String> [] buckets=  new ArrayList[BUCKETS];
        //List<String> buckets2= new ArrayList<>();
        for (int i=0;i<BUCKETS;i++)
            buckets[i] = new ArrayList<>();

        for (int pos = stringlen-1;pos>=0;pos--){
            for (String s : arr)
                buckets[s.charAt(pos)].add(s);

                int idx = 0;
                for(ArrayList<String> thisBuckets: buckets){
                    for(String s1 :thisBuckets)
                        arr[idx++]=s1;
                    thisBuckets.clear();

                }


        }


    }

    public static void main(String[] args) {
        String[] arr = new String[10];
      /*  for (int i =0;i<50;i++){
            arr[i]= String.valueOf (((int)Math.random()*100));
        }*/
         Scanner s =new Scanner(System.in);
         for (int i=0;i<10;i++){
             arr[i]=s.next();
         }
        redixSort(arr,3);
        for(String a: arr){
            System.out.println(a);
        }
    }
}
