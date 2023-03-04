package seminars.OOP_1;

/**
 * main
 */
public class familyTree {

    public static void main (String[] args) {
        Human sonya = new Human("женский");
        Human kate = new Human("женский");
        Human alex = new Human("Александр", "Сидоров", "мужской");
        Human vasya = new Human("мужской");
        Human petya = new Human("мужской");
        Human mary = new Human("Мария", "Иванова", "женский");
        Human kolya = new Human("Николай", "Петров", "мужской");
        Human lena = new Human("Елена", "Иванова", "женский");
        Human fedya = new Human("Фёдор", "Иванов", "мужской");
        Human ann = new Human("Анна", "Петрова", "женский");
        Human vanya = new Human("Иван", "Петров", "мужской");

        sonya.setName("София");
        sonya.setSurname("Сидорова");
        sonya.setFather(alex);
        sonya.setMother(kate);

        kate.setName("Екатерина");
        kate.setSurname("Сидорова");
        kate.setSpouse(alex);
        kate.setFather(petya);
        kate.setMother(mary);

        alex.setChildren(sonya);
        
        vasya.setName("Василий");
        vasya.setSurname("Иванов");
        vasya.setFather(petya);
        vasya.setMother(mary);

        petya.setName("Пётр");
        petya.setSurname("Иванов");
        petya.setFather(fedya);
        petya.setMother(lena);
        petya.setSpouse(mary);

        mary.setFather(vanya);
        mary.setMother(ann);

        kolya.setFather(vanya);
        kolya.setMother(ann);

        lena.setSpouse(fedya);

        ann.setSpouse(vanya);
    }
}