// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package seminars.HW_4;

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList <Integer> startList = new LinkedList <> ();
    
        enqueue(startList, 2);
        enqueue(startList, 5);
        enqueue(startList, 1);
        enqueue(startList, 16);
    
        System.out.println(startList);
    
        int dq = dequeue(startList);
        System.out.println(dq);
        System.out.println(startList);
        
        int f = first(startList);
        System.out.println(f);
        System.out.println(startList);
    }
    
    // помещает элемент в конец очереди
    public static void enqueue (LinkedList<Integer> list, int element){
        list.add(element);
    }
    
    // возвращает первый элемент из очереди и удаляет его
    public static int dequeue(LinkedList<Integer> list) {
        int result = list.pollFirst();
        return result;
    }
    
    // возвращает первый элемент, не удаляя
    public static int first(LinkedList<Integer> list){
        int result = list.peekFirst();
        return result;
    }
}
