package seminars.HW_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
2. Создать множество ноутбуков.
3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

4. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Main {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();

        notebooks.add(new Notebook("Irbis", "NB283", 4, 128, "Windows", "gray", 14699));
        notebooks.add(new Notebook("DEXP", "Aquillon", 4, 128, "Windows", "white", 15999));
        notebooks.add(new Notebook("Aser", "Extensa", 4, 128, null, "black", 22999));
        notebooks.add(new Notebook("HP", "255 G8", 4, 1000, null, "silver", 22999));
        notebooks.add(new Notebook("DEXP", "IdeaPad", 4, 1000, "Linux", "gray", 23999));
        notebooks.add(new Notebook("Aser", "Aspire", 4, 1000, "Linux", "silver", 33999));
        notebooks.add(new Notebook("HP", "CoreBook", 8, 512, "Windows", "gray", 34999));
        notebooks.add(new Notebook("Apple", "MacBook Pro", 16, 512, "macOS", "gray", 236999));
        notebooks.add(new Notebook("HP", "Creator", 16, 2000, "Windows", "black", 224999));

        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                            "1 - производитель,\n" +
                            "2 - ОЗУ,\n" +
                            "3 - Объем ЖД,\n" +
                            "4 - Операционная система,\n" +
                            "5 - Цвет,\n" +
                            "6 - цена");

        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();
        

        switch (answer) {
            case 1:
                System.out.println("Введите цифру, соответствующую нужному производителю:\n" +
                    "1 - Irbis,\n" +
                    "2 - DEXP,\n" +
                    "3 - Aser,\n" +
                    "4 - HP,\n" +
                    "5 - Apple");
                int a = in.nextInt();
                in.close();
                System.out.println("Результаты поиска: ");
                if (a == 1){
                    for (Notebook item: notebooks) {
                        if (item.getManufacturer().equals("Irbis")) {
                            System.out.println(item);
                        }
                    }
                }
                else if (a == 2){
                    for (Notebook item: notebooks) {
                        if (item.getManufacturer().equals("DEXP")) {
                            System.out.println(item);
                        }
                    }
                }
                else if (a == 3){
                    for (Notebook item: notebooks) {
                        if (item.getManufacturer().equals("Aser")) {
                            System.out.println(item);
                        }
                    }
                }
                else if (a == 4){
                    for (Notebook item: notebooks) {
                        if (item.getManufacturer().equals("HP")) {
                            System.out.println(item);
                        }
                    }
                }
                else{
                    for (Notebook item: notebooks) {
                        if (item.getManufacturer().equals("Apple")) {
                            System.out.println(item);
                        }
                    }
                }
                

                break;

            case 2:
                System.out.println("Введите цифру, соответствующую минимальному объему оперативной памяти.\n");
                int b = in.nextInt();
                in.close();
                System.out.println(b);

                break;

            case 3:
                System.out.println("Введите цифру, соответствующую минимальному объему жесткого диска\n");
                int с = in.nextInt();
                in.close();
                System.out.println(с);

                break;
        
            default:
                break;

        }
    }    
}