package main.variables;

public class InitializingVariables {
    static int classVariableInt;
    static boolean classVariableBoolean;

    // Константа
    final static double KM_PER_MILE = 1.61D;


    public static void main(String[] args) {

        /* тип идентификатор;
            или
           тип идентификатор = значение;
        */

        // объявление переменной a типа int
        int a;

        // объявление трех переменных b, c, d типа int
        int b, c, d;

        // объявление переменной e типа int с инициализацией
        int e = 10;

        // объявление еще трех переменных типа int с инициализацией f и h
        int f = 7, g, h = 10;

        byte i;
        byte j = 5;
        byte k = i = j;

        boolean bool = true;

        int dynamic = e + f;

        // Ошибка! Переменная a не проинициализирована
//        System.out.println("Значение переменной a = " + a);

        // Ошибка! Переменная g также не проинициализирована

//        System.out.println("Значение переменной g = " + g);

        System.out.println("Значение переменной i = " + i);
        System.out.println("Значение переменной k = " + k);

        System.out.println("Значение bool в методе main = " + bool);

        System.out.println("Значение переменной класса 'classVariableInt' по-умолчанию = " + classVariableInt);
        System.out.println("Значение переменной класса 'classVariableBoolean' по-умолчанию = " + classVariableBoolean);

        System.out.println("Значение переменной 'dynamic' = " + dynamic);
    }
}
