// Реализовать алгоритм пирамидальной сортировки (HeapSort)
//  https://habr.com/ru/company/otus/blog/460087/

package seminars.HW_5;

public class task3 {
    public static void main(String[] args) {
        int[] array = new int[] {15, 10, 5, 6, 2, 4};

        sort(array);
        print(array);
    }

    private static void sort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
        
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify (array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]){
            largest = right;
        }

        if (largest != i) {
            int tmp = array[i];
            array[i] = array[largest];
            array[largest] = tmp;
            heapify(array, n, largest);
        }
    }

    private static void print (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
        System.out.println();
    }




    
}
