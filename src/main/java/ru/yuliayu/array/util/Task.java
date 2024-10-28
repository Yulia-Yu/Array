package ru.yuliayu.array.util;

public class Task {
    public static int countEvenNum(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) count++;
        }
        return count;
    }

    public static int countOddNum(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) count++;
        }
        return count;
    }

    private static boolean checkPrimeNum(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        return count == 2;
    }

    public static int countPrimeNum(int[] array) {
        int count = 0;
        for (int num : array) {
            if (checkPrimeNum(num)) count++;
        }
        return count;
    }

    public static int sumNumArray(int[] array){
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int differenceInAmounts(int[] array){
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 0; i < array.length; i+=2) sumEven += array[i];
        for(int i = 1; i < array.length; i+=2) sumOdd += array[i];
        return sumEven - sumOdd;
    }

    public static int countZero(int[] array){
        int count = 0;
        for (int num : array) {
            if (num == 0) count++;
        }
        return count;
    }


}
