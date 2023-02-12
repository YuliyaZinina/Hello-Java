// Напишите постфиксный калькулятор. 
// Пользователь вводит данные и операции в обратной польской записи. 
// Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.

// Например:
// 5 4 3 - + => 5 1 + => 6

package seminars.HW_4;

import java.util.Scanner;
import java.util.Stack;

public class task3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите данные и операции в обратной польской записи");
        String input = scanner.nextLine();
        scanner.close();
        
        // System.out.printf("%d\n", st.pop());
        System.out.println(calc(input));
    }

    public static int calc (String input) {
        String[] exp = input.split(" ");
        int res = 0;

        Stack <Integer> st = new Stack <>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } 
            else {
                int x = st.pop();
                int y = st.pop();
                switch (exp[i]) {
                    case "+":
                        res = x + y;
                        st.push(res);
                        break;
                    case "-":
                        res = x - y;
                        st.push(res);
                        break;
                    case "*":
                        res = x * y;
                        st.push(res);
                        break;
                    case "/":
                        res = x / y;
                        st.push(res);
                        break;
                }
            }
        }
        if (st.size() > 1) {
            throw new IllegalStateException("Выражение неверно");
        }
        int result = st.pop();
        return result;
        
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
