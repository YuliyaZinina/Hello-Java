// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что один человек может иметь несколько телефонов.

package seminars.HW_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();

        ArrayList<String> phonesJohn = new ArrayList<>();
        phonesJohn.add("123456");
        phonesJohn.add("345678");
        
        phoneBook.put("John", phonesJohn);

        ArrayList<String> phonesSam = new ArrayList<>();
        phonesSam.add("234567");
        phonesSam.add("987654");
        
        phoneBook.put("Sam", phonesSam);
    }
}
