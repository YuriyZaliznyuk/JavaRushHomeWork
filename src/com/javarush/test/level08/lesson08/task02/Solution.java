package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        createSet();
        removeAllNumbersMoreThan10(createSet());
    }
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < 20; i++)
            set.add(i*3);

        return (HashSet<Integer>)set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        for (Integer e: set)
            if(e > 10)
                set.remove(e);
        return (HashSet)set;
    }
}