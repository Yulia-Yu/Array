package ru.yuliayu.array.service;

public class ActionArray {
    public static int[] filling (int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 18);
        }
        return array;
    }

    public static void write(int[] array){
        for(int num : array){
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }
}
