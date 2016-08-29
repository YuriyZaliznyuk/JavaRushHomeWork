package com.javarush.test.level04.lesson04.task04;

/* Время года
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/

public class Solution
{
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int mount){
        //::CODE:
        if (mount == 1)
            System.out.print("зима");
        else if (mount == 2)
            System.out.print("зима");
        else if (mount == 3)
            System.out.print("весна");
        else if (mount == 4)
            System.out.print("весна");
        else if (mount == 5)
            System.out.print("весна");
        else if (mount == 6)
            System.out.print("лето");
        else if (mount == 7)
            System.out.print("лето");
        else if (mount == 8)
            System.out.print("лето");
        else if (mount == 9)
            System.out.print("осень");
        else if (mount == 10)
            System.out.print("осень");
        else if (mount == 11)
            System.out.print("осень");
        else if (mount == 12)
            System.out.print("зима");
    }
}