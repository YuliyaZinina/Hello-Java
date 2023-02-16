/* Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности.
*/

package seminars.HW_5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        List<String> names = List.of("Иван", "Пётр", "Антон", "Иван", "Алексей", "Иван", "Антон", "Пётр", "Пётр", "Иван");
        Map<String, Integer> nameToRepeat = new HashMap<>();

        for (String item: names) {
            if (nameToRepeat.containsKey(item)) {
                int value = nameToRepeat.get(item);
                value++;
                nameToRepeat.put(item, value);
            }
            else {
                nameToRepeat.put(item, 1);
            }
        }
        System.out.println(nameToRepeat);

        nameToRepeat.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue()) 
        .forEach(System.out::println);
        
    }
    

}
