package com.test;

import org.omg.CORBA.ARG_OUT;

public class insertSort {
    public static void insertsort(int  [] arr){
        int i;
        for (int p=1;p<arr.length;p++){
            int tmp = arr[p];
            for( i = p ;i>0&&arr[i]<arr[i-1];i--){

                  arr[i] = arr[i-1];
            }
            arr[i] =tmp;
        }
    }

    public static void main(String[] args) {
        int [] arr ={456,695,552,112,1572};
        insertsort(arr);
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);

    }
}
