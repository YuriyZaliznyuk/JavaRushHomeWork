package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN = reader.readLine();
        int n = Integer.parseInt(sN);
        String sM = reader.readLine();
        int maximum = Integer.parseInt(sM);

        //напишите тут ваш код
        for (int i = 0; i < n - 1; i++) {
            String sA = reader.readLine();
            int a = Integer.parseInt(sA);
            if (a > maximum)
                maximum = a;
        }

        System.out.println(maximum);
    }
}
