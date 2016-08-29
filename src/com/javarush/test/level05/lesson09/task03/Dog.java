package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    String name, color;
    int height;

    public Dog(String name) {
        this.name = name;
        this.color = null;
        this.height = 50;
    }
    public Dog(String name, int height) {
        this.name = name;
        this.color = null;
        this.height = height;
    }
    public Dog(String name, int height, String color) {
        this.name = name;
        this.color = color;
        this.height = height;
    }
}
