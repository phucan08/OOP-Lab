import java.util.*;
import java.io.*;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        int n = scanner.nextInt(); 
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String phone = scanner.nextLine();
            phoneBook.put(name, phone);
        }

        while (scanner.hasNextLine()) {
            String query = scanner.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}