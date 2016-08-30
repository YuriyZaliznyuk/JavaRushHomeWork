package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<Integer>();

        //напишите тут ваш код
        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        String sD = reader.readLine();
        String sE = reader.readLine();

        int a  = Integer.parseInt(sA);
        int b  = Integer.parseInt(sB);
        int c  = Integer.parseInt(sC);
        int d  = Integer.parseInt(sD);
        int e  = Integer.parseInt(sE);

        nums.add(a);
        nums.add(b);
        nums.add(c);
        nums.add(d);
        nums.add(e);

        Collections.sort(nums);
        for (int i: nums)
            System.out.println(i);
    }
}
