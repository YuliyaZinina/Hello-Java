package seminars.HW_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();

        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
          numbers.add(random.nextInt(0, 100));
        }
        System.out.println(numbers);

        List <Integer> result = sortArray(numbers);
        System.out.println(result);
    }

    public static List <Integer> sortArray(List <Integer> A){ 
        if (A.size() < 2) {
            return A;
        }

        else {
            List <Integer> B = new ArrayList <> (A.size()/2);
            List <Integer> C = new ArrayList <> (A.size()-B.size());

            for (int i = 0; i < A.size(); i++) {
                if (i < A.size()/2) {
                    B.add(A.get(i));
                }
                else {
                    C.add(A.get(i));
                }
            }
            
            B = sortArray(B); 
            C = sortArray(C);

            return mergeArray(B, C);
        }
    }
    
    public static List <Integer> mergeArray(List <Integer> A, List <Integer> B) {
        List <Integer> C = new ArrayList <> ();
        int posA = 0;
        int posB = 0;
        
        while (posA < A.size() && posB < B.size()) {
            if (A.get(posA) < B.get(posB)) {
                C.add(A.get(posA));
                posA++;
            }
            else if (A.get(posA) > B.get(posB)) {
                C.add(B.get(posB));
                posB++;
            }
            else if (A.get(posA) == B.get(posB)) {
                C.add(A.get(posA));
                C.add(B.get(posB));
                posA++;
                posB++;
            }
        }   
        
        if (posA == A.size()){
            while (posB < B.size()){
                C.add(B.get(posB));
                posB++;
            }  
        }
        else {
            while (posA < A.size()){
                C.add(A.get(posA));
                posA++;
            }
        }
        return C;
    }
}
