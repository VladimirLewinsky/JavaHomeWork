import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class H2 {
    //  класс к 3 задаче
    public static void comeback(String x, String b, int n, int y) {

        n = x.length();

        if (y < n) {

            b += x.charAt(n - y - 1);
            comeback(x, b, n - 1, y + 1);

            if (n == b.length()) {
                System.out.println(b);
            }
        }

    }

    public static void main(String[] args) {
        // 1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы
        // другой строки).

        String s = "абвгдеёжз";
        String b = "где";
        System.out.println(s.contains(b));
        System.out.println(s.indexOf(b));
        System.out.println("\n");

        // 2.Напишите программу, чтобы проверить, являются ли две данные строки
        // вращением друг друга (вхождение в обратном порядке).

        String y = "абвгдеёжз";
        String c = "где";

        StringBuffer s1 = new StringBuffer(y);
        StringBuffer b1 = new StringBuffer(c);

        System.out.println(s1.reverse().toString().contains(b1.reverse()));
        System.out.println("\n");

        // 3.*Напишите программу, чтобы перевернуть строку с помощью рекурсии.

        String w = "Тарелка супа";
        comeback(w, "", 0, 0); // метод в самом начале программы;

        // 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3
        // + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

        int a = 56;
        int z = 3;

        StringBuilder newBuilder = new StringBuilder()
                .append(z)
                .append(" - ")
                .append(a)
                .append(" = ")
                .append(z - a)
                .append("\n")

                .append(z)
                .append(" * ")
                .append(a)
                .append(" = ")
                .append(z * a)
                .append("\n")

                .append(z)
                .append(" + ")
                .append(a)
                .append(" = ")
                .append(z + a)
                .append("\n")

                .append(z)
                .append(" / ")
                .append(a)
                .append(" = ")
                .append((float) z / a);

        System.out.println(newBuilder);
        System.out.println("\n");

        // 5. Замените символ “=” на слово “равно”. Используйте методы
        // StringBuilder.insert(),StringBuilder.deleteCharAt().

        System.out.println(newBuilder.deleteCharAt(7).insert(7, "равно")
                .deleteCharAt(24).insert(24, "равно")
                .deleteCharAt(41).insert(41, "равно")
                .deleteCharAt(57).insert(57, "равно"));

        System.out.println("\n");

        // 6. *Замените символ “=” на слово “равно”. Используйте методы
        // StringBuilder.replace().

        long start = System.currentTimeMillis();
        System.out.println(newBuilder.toString().replace(" = ", " равно "));
        long stop = System.currentTimeMillis();
        System.out.println("\n");

        // 7.**Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов
        // "=" средствами String и StringBuilder.

        long startstring = System.currentTimeMillis();
        String m = "";
        for (int i = 0; i < 10_001; i++) {
            m = m + "=";
        }
        long stopstring = System.currentTimeMillis();

        long startstringbuilder = System.currentTimeMillis();
        StringBuilder m1 = new StringBuilder();
        for (int i = 0; i < 10_001; i++) {
            m1.append("=");
        }
        long stopstringbuilder = System.currentTimeMillis();

        // Сравниение времени выполнения

        System.out.println(stop - start); // задача 6
        System.out.println(stopstring - startstring); // время выполнения средством String
        System.out.println(stopstringbuilder - startstringbuilder);// время выполнения средством StringBuilder

    }
}
