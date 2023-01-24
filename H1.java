
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class H1 {
    public static void main(String[] args) {

        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

        int i = new Random().nextInt(2001);
        System.out.println(i);

        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        int t = 2;
        int n = 0;
        while (t < i) {
            t = t * 2;
            n++;
        }
        System.out.println(n);
        String b = Integer.toBinaryString(i);
        System.out.println(b);
        System.out.println(b.length() - 1);

        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в
        // массив m1
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (i < Short.MAX_VALUE) {
            if (i % n == 0) {
                list.add(i);
            }
            i++;
        }
        Integer[] m1 = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(m1));

        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и
        // сохранить в массив m2

        int z = Short.MIN_VALUE;
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        while (z < i) {
            if (z % n != 0) {
                list2.add(z);
            }
            z++;
        }
        Integer[] m2 = list2.toArray(new Integer[0]);
        System.out.println( Arrays.toString(m2));

    }
}
