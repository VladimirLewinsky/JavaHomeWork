import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class h5 {
    public static void main(String[] args) {
        
        // 1.Создать словарь HashMap. Обобщение <Integer, String>.
        HashMap<Integer,String> hashmap = new HashMap<>();


        // 2.Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)

        hashmap.put(1, "белый");
        hashmap.put(2, "желтый");
        hashmap.put(3, "черный");

        System.out.println(hashmap);

        //3. Изменить значения дописав восклицательные знаки.
        for (int i = 1; i <= hashmap.size(); i++) {
            hashmap.compute(i, (k,v) -> v = v+"!");
        }
        System.out.println(hashmap);
        //4. *Создать TreeMap, заполнить аналогично.

        TreeMap<Integer,String> treemap = new TreeMap<>();
        
        for (int i = 1; i <= hashmap.size(); i++) {
            Integer mapkey = i;
            String mapvalue = hashmap.get(i);
            treemap.put(mapkey,mapvalue);
        }
        System.out.println(treemap);
        
        // 5.*Увеличить количество элементов до 1000 случайными ключами и общей строкой

        while (treemap.size() != 1000){
            int randomkey = new Random().nextInt(10_000);
            treemap.putIfAbsent(randomkey , " ");
        }
        
        // System.out.println(treemap.size());
        // System.out.println(treemap.values());

        // 6**Сравнить время последовательного и случайного перебора тысячи элементов словарей.
        
        while (hashmap.size() != 1000){
            int randomkey2 = new Random().nextInt(10_000);
            hashmap.putIfAbsent(randomkey2, " ");
        }
        

        long hashmaptimestart = System.currentTimeMillis();
        
        for (int i = 0; i < hashmap.size(); i++) {
            hashmap.get(i);
        }
        long hashmaptimeend = System.currentTimeMillis();

        long treemaptimestart = System.currentTimeMillis();
        for (int i = 0; i < treemap.size(); i++) {
            treemap.get(i);
        }
        long treemaptimeend = System.currentTimeMillis();
        System.out.println(treemaptimeend-treemaptimestart);
        System.out.println(hashmaptimeend-hashmaptimestart);
        
        }
        
}
