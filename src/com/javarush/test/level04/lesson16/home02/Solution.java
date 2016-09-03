package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);

        if (a >= b && b >= c)
            System.out.print(b);
        else if (a >= c && c >= b)
            System.out.print(c);
        else if (b >= a && a >= c)
            System.out.print(a);
        else if (b >= c && c >= a)
            System.out.print(c);
        else if (c >= a && a >= b)
            System.out.print(a);
        else if (c >= b && b >= a)
            System.out.print(b);
    }
}
