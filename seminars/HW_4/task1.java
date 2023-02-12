// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package seminars.HW_4;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("До");
        list.add("Ре");
        list.add("Ми");
        list.add("Фа");
        list.add("Соль");
        list.add("Ля");
        list.add("Си");

        System.out.println(list);
        System.out.println(revers(list));
    }

    static LinkedList<String> revers (LinkedList<String> list) {
        int n = list.size();
        LinkedList<String> newList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            newList.add(list.removeLast());
        }
        return newList;
    }

}

