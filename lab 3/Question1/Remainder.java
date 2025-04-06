import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter values for m and n
        System.out.print("Enter m and n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int count = 0;

        // Check numbers from m to n
        for (int i = m; i <= n; i++) {
            if (i % 3 == 1 && i % 4 == 2 && i % 5 == 3 && i % 6 == 4) {
                count++;
            }
        }

        // Output the result
        System.out.println(count);
        sc.close();
    }
}
