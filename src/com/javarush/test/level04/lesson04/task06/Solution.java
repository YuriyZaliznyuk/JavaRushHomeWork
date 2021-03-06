package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sWeekDay = reader.readLine();
        int nWeekDay = Integer.parseInt(sWeekDay);

        if (nWeekDay == 1)
            System.out.print("понедельник");
        else if (nWeekDay == 2)
            System.out.print("вторник");
        else if (nWeekDay == 3)
            System.out.print("среда");
        else if (nWeekDay == 4)
            System.out.print("четверг");
        else if (nWeekDay == 5)
            System.out.print("пятница");
        else if (nWeekDay == 6)
            System.out.print("суббота");
        else if (nWeekDay == 7)
            System.out.print("воскресенье");
        else
            System.out.print("такого дня недели не существует");
    }
}