package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    String name, color;
    int height;

    public void initialize(String name) {
        this.name = name;
        this.color = null;
        this.height = 50;
    }
    public void initialize(String name, int height) {
        this.name = name;
        this.color = null;
        this.height = height;
    }
    public void initialize(String name, int height, String color) {
        this.name = name;
        this.color = color;
        this.height = height;
    }
}
