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
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("/Users/arainay/GeekBrains/Hello Java/seminars/HW_2/task3File.txt")); 
        String originalString = br.readLine();
        br.close();
        System.out.println(originalString);

        String startString = getString(originalString);
        System.out.println(startString);

        String[] studentsArray = getStudentsArray(startString, ", ");
        System.out.println(Arrays.toString(studentsArray));

        for (int i = 0; i < studentsArray.length; i++) {
            String[][] studentArray;
            studentArray[i] = studentsArray[i].split(",");
        }
    }
    // Убираем символы (скобки) по краям
    static String getString (String a){
        String b = a.substring(1, a.length()-1);
        return b;
    }

    // Получаем массив записей о студентах, удаляем скобки и считаем их количество
    static String[] getStudentsArray (String str, String reg) {
        String[] studentsArray = str.split(reg);
        int count = 0;
        for (int i = 0; i < studentsArray.length; i++) {
            studentsArray[i] = getString(studentsArray[i]);
            count += 1;
        }
        return studentsArray;
    }

    // Получаем массив данных
    static void getData (String[]array){
        String[][] student = new String[1][array.length];
        for (int i = 0; i < array.length; i++){
            String[][] d = getPairsArray(array[i]);
            System.out.println(d);
        }
    }


    static String[][] getPairsArray (String b){
        // Разделяем строку на пары и считаем их количество
        String[] pairs = b.split(", ");
        int count = 0;
        for (int i = 0; i < pairs.length; i++) {
            count += 1;
        }

        // Создаём массив массивов значений пар
        String[][] pairsArray = new String [count][2];
    
        for (int i = 0; i < pairs.length; i++) {
            pairsArray[i] = pairs[i].split(":");
        }
        return pairsArray;
    }

    // Формируем результат
    

    
    
}
