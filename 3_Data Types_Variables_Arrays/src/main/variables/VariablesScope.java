package main.variables;

public class VariablesScope {

    public static void main(String[] args) {
        // это переменная доступна всему коду из метода main()
        int x;

        x = 15;

        if (x == 15) {
            int y = 30;

            // формат будет рассмотрен позже
//            System.out.printf("x = %d y = %d \n", x, y);
            System.out.println("x = " + x + " y = " + y);
            x = y * 2;
        }

        // Ошибка! переменная y недоступна в этой области кода
//        y = 100;

        System.out.println("x = " + x);

        int bar = 1;
        {
            // Ошибка! переменная bar уже определена
//            int bar = 2;

            int z = 17;
        }
        // Ошибка! Переменная z недоступна вне своего блока кода
//        z = 34;

        // внешнему блоку кода недоступна область внутреннего блока. Поэтому мы можем объявить переменную z
        int z = 17;
    }
}
