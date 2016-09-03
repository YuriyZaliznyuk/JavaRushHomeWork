package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        int countPositive = 0, countNegitve = 0;

        if (a > 0)
            countPositive += 1;
        else
            countNegitve += 1;
        if (b > 0)
            countPositive += 1;
        else
            countNegitve += 1;
        if (c > 0)
            countPositive += 1;
        else
            countNegitve += 1;

        System.out.println("количество отрицательных чисел: " + countNegitve);
        System.out.println("количество положительных чисел: " + countPositive);
    }
}