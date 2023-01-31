import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class H3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1. Создать новый список, добавить несколько строк и вывести коллекцию на
        // экран.

        ArrayList<String> list = new ArrayList<>();
        list.add("Красный");
        list.add("Оранжевый");
        list.add("Желтый");
        list.add("Зеленый");
        list.add("Голубой");
        list.add("Синий");
        list.add("Фиолетовый");

        list.forEach((k) -> System.out.println(k));

        // 2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            str += "!";
            // System.out.println(str);
            iterator.set(str);
        }

        System.out.println(list);

        // 3.Вставить элемент в список в первой позиции.
        list.add(0, "Черный");
        list.forEach((k) -> System.out.println(k));

        // 4. Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println('\n');
        System.out.println(list.get(4));
        // 5. Обновить определенный элемент списка по заданному индексу
        list.set(5, "Арбуз");
        System.out.println(list);
        // 6. Удалить третий элемент из списка.
        list.remove(2);
        System.out.println(list);

        // 7.Поиска элемента в списке по строке.
        System.out.println(list.contains("Арбуз"));

        // 8.Создать новый список и добавить в него несколько елементов первого списка.
        ArrayList<String> spisok = new ArrayList<>();

        for (int i = 0; i < 4; i++) {

            int rnd = new Random().nextInt(list.size());
            spisok.add(list.get(rnd));
 
        }
        System.out.println(spisok);

        //9. Удалить из первого списка все элементы отсутствующие во втором списке.
        // list.retainAll(spisok);      
        // System.out.println(list);
        // 10.*Сортировка списка
        
        System.out.println(list);
        
       list.sort(new Comparator<String>() {
            @Override
            public int compare(String t0, String t1) {
                return t0.length() - t1.length(); 
            }
        }); 

        System.out.println(list);
    }
}
