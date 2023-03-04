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
    ArrayList<Human> children;

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
     * @param children дети
     */
    public Human(String name, String surname, String sex, Human father, Human mother, Human spouse, ArrayList<Human> children) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.father = father;
        this.mother = mother;
        this.spouse = spouse;
        this.children = children;
    }

    public Human(String name, String surname, String sex){
        this(name, surname, sex, null, null, null, null);
    }

    public Human(String sex) {
        this("имя: неизвестно", "фамилия: неизвестно", sex, 
        null, null, null, null);
    }

    @Override
    public String toString() {
        return name + " " + surname + "\nid: " + id + "\n";   
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
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setSpouse(Human spouse) {
        this.spouse = spouse;
    }

    public void setChildren(Human child) {
        this.children.add(child);
    }

    
}
