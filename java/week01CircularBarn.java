import java.util.Scanner;

public class week01CircularBarn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] destinations = new int[n];
        for (int i = 0; i < n; i++) {
            destinations[i] = scanner.nextInt();
        }

        int low = 100 * 1000;

        for (int i = 0; i < destinations.length; i++) {
            int total = 0;
            for (int j = 0; j < destinations.length; j++) {
                int destination = destinations[j];
                total += ((j - i + n) % n) * destination;
            }

            if (total < low) {
                low = total;
            }
        }

        System.out.println(low);

        scanner.close();
    }
}