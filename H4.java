import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class H4 {
    /**
     * 
     * 
     * @param args
     * @throws IOException
     */
   

    public static void main(String[] args) throws IOException {

        // 1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль
        // используя классы FileWriter и FileReader

        // FileWriter fileWriter = new FileWriter("hm.sql");
        // fileWriter.append("Homework 4");
        // fileWriter.flush();

        // FileReader reader = new FileReader("hm.sql");
        // String text = "";
        // while(reader.ready()){
        // text += (char)reader.read();
        // }
        // System.out.println(text);

        // 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через
        // пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
        FileWriter fileWriter2 = new FileWriter("db.sql");
        fileWriter2.append("Vladimir Zhirinovsky 76 male\n");
        fileWriter2.append("Alexander Zharnakov 34 male\n");
        fileWriter2.append("Galina Simonova 55 female\n");
        fileWriter2.append("Yuriy Boyko 28 male\n");
        fileWriter2.append("Valeria Germanika 45 female");
        fileWriter2.flush();

        FileReader reader2 = new FileReader("db.sql");
        String people = "";
        while (reader2.ready()) {
            people += (char) reader2.read();
        }
        System.out.println(people);
        System.out.println("\n");
        // 3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки.
        // Фамилии, имена, отчества, возрас и пол в отдельных списках.

        ArrayList<String> famil = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> pol = new ArrayList<>();

        String[] word = people.split("\n");

        System.out.println(Arrays.toString(word));
        System.out.println("\n");

        for (int i = 0; i < word.length; i++) {
            String[] tmp = word[i].split(" ");

            famil.add(tmp[0]);
            name.add(tmp[1]);
            age.add(Integer.parseInt(tmp[2]));
            pol.add(tmp[3]);

        }
        System.out.println(famil);
        System.out.println(name);
        System.out.println(age);
        System.out.println(pol);
        System.out.println("\n");
        // 4.Отсортировать по возрасту используя дополнительный список индексов.
        
        ArrayList<Integer> agesort = new ArrayList<>();
       
        for (int i = 0; i < age.size(); i++) {
            agesort.add(i);
            
        }
       for (int i = 0; i < agesort.size(); i++) {
            for (int j = 0; j < agesort.size(); j++) {
                if (age.get(agesort.get(i)) < age.get(agesort.get(j))){
                    Collections.swap(age, agesort.get(i), agesort.get(j));
                    Collections.swap(agesort, agesort.get(i), agesort.get(j)); // как вариант, чтобы потом было удобно другие списки сортировать
                }
            }
       }
       System.out.println(age);
       System.out.println(agesort); 

        
 
        }
        
    }


