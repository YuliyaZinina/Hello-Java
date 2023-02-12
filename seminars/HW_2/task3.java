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
// import java.io.PushbackInputStream;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("/Users/arainay/GeekBrains/Hello Java/seminars/HW_2/task3File.txt")); 
        String originalString = br.readLine();
        br.close();
        System.out.println(originalString);

        // убираем []
        String startStr = GetString(originalString);
        // System.out.println(startStr);

        // формируем массив записей
        String[] startArr = startStr.split(", ");

        
        // Формируем массив данных
        String[] resultArray = new String[startArr.length];
        for (int i = 0; i < startArr.length; i++){
            String a = GetString(startArr[i]);

            String[] b = a.split(",");

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < b.length; j++){
                String[] c = b[j].split(":");
                String value = GetString(c[1]);

                switch (j) {
                    case 0: sb.append("Студент ");
                    sb.append(value);
                    break;
                    case 1: sb.append(" получил ");
                    sb.append(value);
                    break;
                    case 2: sb.append(" по предмету ");
                    sb.append(value);
                    break;
                }
            }
            resultArray[i] = sb.toString();
        }
        System.out.println(Arrays.toString(resultArray));
    }

    // Убираем фигурные скобки по краям
    static String GetString (String a){
        String b = a.substring(1, a.length()-1);
        return b;
    }
}