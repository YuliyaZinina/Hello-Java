package seminars.HW_1;

public class task1 {
    
    static int Triangle (int n){
        if (n == 1) return 1;
        return Triangle(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.println(Triangle(10));
    }
    
}
