// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
// Значения null не включаются в запрос.


package seminars.HW_2;

import java.io.BufferedReader;
import java.io.FileReader;

public class task1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("/Users/arainay/GeekBrains/Hello Java/seminars/HW_2/task1File.txt")); 
        String originalString = br.readLine();
        br.close();
        System.out.println(originalString);
    
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