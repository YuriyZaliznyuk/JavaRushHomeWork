package com.javarush.test.level03.lesson04.task05;

/* Сумма 10 чисел
Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
1
1+2=3
1+2+3=6
1+2+3+4=10
...
Пример вывода:
1
3
6
10
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        int i = 0, sum = 0;
        while (++i < 11)
        {
            sum += i;
            System.out.println(sum);
        }
    }
}