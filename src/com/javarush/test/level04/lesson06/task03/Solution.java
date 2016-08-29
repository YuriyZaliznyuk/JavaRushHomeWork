package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        if (a >= b && a >= c)
            if (b >= c)
                System.out.print(a + " " + b + " " + c);
            else
                System.out.print(a + " " + c + " " + b);
        else if (b >= a && b >= c)
            if (a >= c)
                System.out.print(b + " " + a + " " + c);
            else
                System.out.print(b + " " + c + " " + a);
        else if (c >= a && c >= b)
            if (a >= b)
                System.out.print(c + " " + a + " " + b);
            else
                System.out.print(c + " " + b + " " + a);
    }
}
