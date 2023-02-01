// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

package seminars.HW_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] startArray = new int[] {1, 8, 3, 2, 5};
        int[] resultArray = sortArray(startArray);
        System.out.println(Arrays.toString(resultArray));
    }

    static int[] sortArray (int[] array){
        try (FileWriter fw = new FileWriter("/Users/arainay/GeekBrains/Hello Java/seminars/HW_2/task2LogFile.txt", false)) {
            int iterNumber = 1;
            for (int k = array.length - 1; k > 0; k--){

                String log1 = String.format("Итерация номер - %d \n", iterNumber);
                fw.write(log1);
            
                for(int i = 0; i < k; i++) {

                    Boolean b = array[i] > array[i+1];
                    String log2 = String.format("i = %d, i+1 = %d, i>i+1 == %b \n", array[i], array[i+1], b);
                    fw.write(log2);

                    if (array[i] > array[i+1]){
                        int temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                    }

                    String log3 = Arrays.toString(array);
                    fw.write(log3);
                    fw.write("\n");
                }
                iterNumber += 1;
            }
            fw.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }
}