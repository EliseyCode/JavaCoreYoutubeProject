package main.datatypes;

public class PrimitiveDataTypes {

    // Целые числа
    byte b = 27;                // от -128 до 127
    short s = 12535;            // от -32768 до 32767
    int i = 128540;             // от -2147483648 до 2147483647
    long l = 5_000_000_000L;    // от -9223372036854775808 до 9223372036854775807
    long l2 = 1_000_000;

    // Числа с плавающей точкой
    float f = 0.7f;             // от 4.9e-324 до 1.8e+308
    double d = 0.4d;            // от 1.4e-045 до 3.4e+038

    // Символы
    char ch1 = 'a';             // от 0 до 65536, шестнадцатеричными от \u0000 до \uFFFF или символ в кавычках ''
    char ch2 = 15;

    // Логические
    boolean b1 = true;          // true или false
    boolean b2 = false;

    public static void main(String[] args) {

        // Особенности при вычислении примитивных типов с плавающей точкой связанные с IEEE-754
        float f1 = 0.7f;
        float f2 = 0.4f;

        System.out.println(f1 - f2);

        float f3 = 0.9f;
        float f4 = 0.5f;

        System.out.println(f3 - f4);

        // Пример объявления примитивного типа char представляющего символы Unicode
        char ch = 85;

        System.out.println(ch);

        char ch2 = 85 + 3;

        System.out.println(ch2);

        char ch3 = 'a' + 3;

        System.out.println(ch3);
    }
}
