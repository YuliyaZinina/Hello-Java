// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, 
// используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package seminars.HW_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PushbackInputStream;
import java.util.Arrays;

public class task3test {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("/Users/arainay/GeekBrains/Hello Java/seminars/HW_2/task3File.txt")); 
        String originalString = br.readLine();
        br.close();
        System.out.println(originalString);

        // убираем []
        String startStr = GetString(originalString);
        System.out.println(startStr);

        // формируем массив записей
        String[] startArr = startStr.split(", ");
        System.out.println(Arrays.toString(startArr));

        
        // Формируем массив данных
        for (int i = 0; i < startArr.length; i++){
            String a = GetString(startArr[i]);
            System.out.println(a);

            String[] b = a.split(",");
            System.out.println(Arrays.toString(b));

            for (int j = 0; j < b.length; j++){
                String[] c = b[j].split(":");
                System.out.println(Arrays.toString(c));

                String key = GetString(c[0]);
                String value = GetString(c[1]);
                System.out.println(key);
                System.out.println(value);

                StringBuilder sb = new
            }
        }
        
        
        


    }

    // Убираем фигурные скобки по краям
    static String GetString (String a){
        String b = a.substring(1, a.length()-1);
        return b;
    }

    // Разделяем строку на пары
    //  Считаем количество пар и Создаём массив пар, где каждая пара разделена и помещена в массив
    static String[][] getPairsArray (String b){
        String[] pairs = b.split(", ");
        int count = 0;
        for (int i = 0; i < pairs.length; i++) {
            count += 1;
        }

        String[][] pairsArray = new String [count][2];
    
        for (int i = 0; i < pairs.length; i++) {
        pairsArray[i] = pairs[i].split(":");
        }
        return pairsArray;
    }

    // Формируем результат
    static String getRequestString (StringBuilder sb, String[][] splittedPairs){
        for (int i = 0; i < splittedPairs.length; i++) {
            String key = splittedPairs[i][0];
            String value = splittedPairs[i][1];
    
            if (value.contains("null") == false){
                if (i > 0){
                    sb.append(" AND ").append(key.substring(1, key.length()-1)).append(" = ").append(value);
                }
                else {
                    sb.append(key.substring(1, key.length()-1)).append(" = ").append(value);
                }
            }       
          }
        String RequestString = sb.toString();
        return RequestString;
    }
}
