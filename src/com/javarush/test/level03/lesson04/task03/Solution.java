package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg01 = new Zerg();
        Zerg zerg02 = new Zerg();
        Zerg zerg03 = new Zerg();
        Zerg zerg04 = new Zerg();
        Zerg zerg05 = new Zerg();
        Zerg zerg06 = new Zerg();
        Zerg zerg07 = new Zerg();
        Zerg zerg08 = new Zerg();
        Zerg zerg09 = new Zerg();
        Zerg zerg10 = new Zerg();

        Protos protos01 = new Protos();
        Protos protos02 = new Protos();
        Protos protos03 = new Protos();
        Protos protos04 = new Protos();
        Protos protos05 = new Protos();

        Terran terran01 = new Terran();
        Terran terran02 = new Terran();
        Terran terran03 = new Terran();
        Terran terran04 = new Terran();
        Terran terran05 = new Terran();
        Terran terran06 = new Terran();
        Terran terran07 = new Terran();
        Terran terran08 = new Terran();
        Terran terran09 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();

        zerg01.name = "zerg01";
        zerg02.name = "zerg02";
        zerg03.name = "zerg03";
        zerg04.name = "zerg04";
        zerg05.name = "zerg05";
        zerg06.name = "zerg06";
        zerg07.name = "zerg07";
        zerg08.name = "zerg08";
        zerg09.name = "zerg09";
        zerg10.name = "zerg10";

        protos01.name = "protos01";
        protos02.name = "protos02";
        protos03.name = "protos03";
        protos04.name = "protos04";
        protos05.name = "protos05";

        terran01.name = "terran01";
        terran02.name = "terran02";
        terran03.name = "terran03";
        terran04.name = "terran04";
        terran05.name = "terran05";
        terran06.name = "terran06";
        terran07.name = "terran07";
        terran08.name = "terran08";
        terran09.name = "terran09";
        terran10.name = "terran10";
        terran11.name = "terran11";
        terran12.name = "terran12";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}