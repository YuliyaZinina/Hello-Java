// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package seminars.HW_3;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class task2 {
    
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();
        List <Integer> result = new ArrayList<>();

        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
          numbers.add(random.nextInt(0, 100));
        }
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            int item = numbers.get(i);
            if (item%2 != 0) {
                result.add(item);
            }
        }
        System.out.println(result);
    }
}
