package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String sD = reader.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        int d = Integer.parseInt(sD);

        if (a >= b && a >= c && a >= d)
            System.out.print(a);
        else if (b >= c && b >= d)
            System.out.print(b);
        else if (c >= d)
            System.out.print(c);
        else
            System.out.print(d);
    }
}
