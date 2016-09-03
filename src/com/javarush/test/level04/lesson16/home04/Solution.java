package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sName = reader.readLine();
        String sY = reader.readLine();
        String sM = reader.readLine();
        String sD = reader.readLine();
        int nY = Integer.parseInt(sY);
        int nM = Integer.parseInt(sM);
        int nD = Integer.parseInt(sD);

        System.out.println("Меня зовут " + sName);
        System.out.println("Я родился " + nD + "." + nM + "." + nY);
    }
}
