package ru.yuliayu.array._main;

import ru.yuliayu.array.service.ActionArray;
import ru.yuliayu.array.util.Task;


public class _Main {
    public static void main(String[] args) {
        int[] mas = new int[10];
        mas = ActionArray.filling(mas);
        ActionArray.write(mas);
        System.out.println("Количество четных чисел в массиве: " + Task.countEvenNum(mas));
        System.out.println("Количество нечетных чисел в массиве: " + Task.countOddNum(mas));
        System.out.println("Количество простых чисел в массиве: " + Task.countPrimeNum(mas));
        System.out.println("Сумма всех чисел в массиве: " + Task.sumNumArray(mas));
        System.out.println("Разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в " +
                "массиве: " + Task.differenceInAmounts(mas));
        System.out.println("Количество числа 0 в массиве: " + Task.countZero(mas));

    }
}
