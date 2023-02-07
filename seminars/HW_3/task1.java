// Реализовать алгоритм сортировки слиянием.

package seminars.HW_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class task1 {
    static Random random = new Random();
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
          randomNumbers[i] = (random.nextInt (1, 100));
        }
        System.out.println(Arrays.toString(randomNumbers));
    
        sort(randomNumbers);
        if (randomNumbers.length > 1) {
          sort(randomNumbers);
        }
        else {
          System.out.println("Массив состоит из одного элемента");
        }
    
        
        }
    
      static void sort (int[] a) {
        int n = a.length;
        int[] res = new int[n];
        int[] c = new int[(n + 1)/2];
        int[] b = new int[n - c.length];
 
        for (int i = 0; i < n; i++)
        {
            if (i < c.length) {
                c[i] = a[i];
            }
            else {
                b[i - c.length] = a[i];
            }
        }

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(b));
        
    
        if (c.length == 1 && b.length == 1) {
            for (int j = 0; j < a.length; j++){
                if (c[0] < b[0]) {
                    res[j] = c[0];
                    res[j+1] = (b[0]);
                }
                else {
                    res[j] = b[0];
                    res[j+1] = c[0];
                }
            }
        }
        else {
          sort(c);
        }
        System.out.println(Arrays.toString(res));
      }  
}
    




  