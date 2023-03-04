package seminars.OOP_1;

import java.util.ArrayList;

/**
 * Человек
 */
public class Human {
    private static int count = 0;
    static {
    count = 1;
    }

    final int id;
    private String name;
    String surname;
    String sex;
    Human father;
    Human mother;
    Human spouse;
    ArrayList<Human> children = new ArrayList<>(); //изменить на Set, чтобы исключить дубликаты => ??переопределить?? .equals()

    {
        id = count;
        count++;
    }
    
    /**
     * Конструктор для создания экземпляра класса Человек
     * @param id уникальный идентификатор
     * @param name имя
     * @param surname фамилия
     * @param sex пол
     * @param father отец
     * @param mother мать
     * @param spouse супруг/супруга
     */
    public Human(String name, String surname, String sex, Human father, Human mother, Human spouse) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.father = father;
        this.mother = mother;
        this.spouse = spouse;
    }

    public Human(String name, String surname, String sex){
        this(name, surname, sex, null, null, null);
    }

    public Human(String sex) {
        this("имя: неизвестно", "фамилия: неизвестно", sex, 
        null, null, null);
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public Human getSpouse() {
        return spouse;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setFather(Human father) {
        this.father = father;
        // если у отца нет этого ребенка в списке детей, добавляем ему ребенка
        if (father.children.contains(this) == false) {
            father.children.add(this);
        }
    }

    public void setMother(Human mother) {
        this.mother = mother;
        if (mother.children.contains(this) == false) {
            mother.children.add(this);
        }
    }

    public void setSpouse(Human spouse) {
        this.spouse = spouse;
        if (spouse.getSpouse() == null){
            spouse.setSpouse(this);
        }
        
    }

    public void setChildren(Human child) {
        if (this.children.contains(child) == false) {
            children.add(child);
        }
    }

    @Override
    public String toString() {
        return name + " " + surname;   
    }
}
