package ru.yuliayu.array._main;

import ru.yuliayu.array.service.ArrayService;


public class _Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        array = ArrayService.filling(array);
        ArrayService.write(array);
        System.out.println("Количество четных чисел в массиве: " + ArrayService.countEvenNum(array));
        System.out.println("Количество нечетных чисел в массиве: " + ArrayService.countOddNum(array));
        System.out.println("Количество простых чисел в массиве: " + ArrayService.countPrimeNum(array));
        System.out.println("Сумма всех чисел в массиве: " + ArrayService.sumNumArray(array));
        System.out.println("Разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в " +
                "массиве: " + ArrayService.differenceInAmounts(array));
        System.out.println("Количество числа 0 в массиве: " + ArrayService.countZero(array));

    }
}
