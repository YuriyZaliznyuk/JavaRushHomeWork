package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 5;
        String sM = reader.readLine();
        int minimum = Integer.parseInt(sM);

        //напишите тут ваш код
        for (int i = 0; i < n - 1; i++) {
            String sA = reader.readLine();
            int a = Integer.parseInt(sA);
            if (a < minimum)
                minimum = a;
        }
        System.out.println("Minimum = " + minimum);
    }
}
