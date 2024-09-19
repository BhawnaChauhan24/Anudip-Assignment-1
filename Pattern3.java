package ajp;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 3; // Number of rows

        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print the decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
