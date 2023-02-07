// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

package seminars.HW_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();

        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
          numbers.add(random.nextInt(0, 100));
        }
        System.out.println(numbers);

        int min = numbers.get(0); 
        int max = numbers.get(0);
        int sum = 0;
        

        for (int i = 0; i < numbers.size(); i++) {
            int item = numbers.get(i);
            if (item < min) {
                min = item;
            }
            if (item > max) {
                max = item;
            }
            sum += item;
        }
        double average = (double)sum / numbers.size();

        System.out.printf("Минимум = %d, максимум = %d, среднее арифметическое = %.2f \n", min, max, average);
    }
}
