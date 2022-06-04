import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Dz6{

    public static void main(String[] args) {

        // Операция сложения

        int a = 10;
        int b = 8;
        int c = a + b;
        int d = 4 + b;

        System.out.println(c);
        System.out.println(d);

        // Операция вычесления

         a = 10;
         b = 8;
         c = a - b;
         d = 4 - a;

        System.out.println(c);
        System.out.println(d);

        // Операция умножения

         a = 10;
         b = 8;
         c = a * b;
         d = b * 5;


        System.out.println(c);
        System.out.println(d);

        // Операция деления

        int number_One = 20;
        int number_Two = 4;
        int number_Three = a / b;
        double number_Four = 22.5 / 4.5;


        System.out.println(number_Three);
        System.out.println(number_Four);


        double k = 20 / 4;

        System.out.println(k);


        double f = 20.0 / 4;

        System.out.println(f);

        // Получение остатка от деления двух чисел

         a = 33;
         b = 5;
         c = a % b;
         d = 22 % 4;

        System.out.println(c);
        System.out.println(d);

        // ++ (префиксный инкремент)

         a = 8;
         b = ++a;
        System.out.println(a);
        System.out.println(b);

        // ++ (постфиксный  инкремент)

         a = 8;
         b = a++;

        System.out.println(a);
        System.out.println(b);

        // -- (префиксный декремент)

         a = 8;
         b = --a;
        System.out.println(a);
        System.out.println(b);

        // -- (постфиксный декремент)

         a = 8;
         b = a--;
        System.out.println(a);
        System.out.println(b);

         a = 8;
         b = 7;
         c = a + 5 * ++b;

        System.out.println(c);

         a = 8;
         b = 7;
         c = (a + 5) * ++b;
        System.out.println(c);

        int x = 10 / 5 * 2;
        System.out.println(x);

        double number = 2.0 - 1.1;
        System.out.println(number);
    }
}
