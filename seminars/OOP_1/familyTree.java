package seminars.OOP_1;

/**
 * main
 */
public class familyTree {

    public static void main (String[] args) {
        Human kate = new Human("женский");
        Human tom = new Human("Анатолий", "Иванов", "мужской");
        System.out.println(kate);
        System.out.println(tom);
        
    }
}