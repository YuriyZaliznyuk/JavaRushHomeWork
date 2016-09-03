package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        int i = 0, j;
        while (++i < 11) {
            j = 0;
            while (++j < 11) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }
}