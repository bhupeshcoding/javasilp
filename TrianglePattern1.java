import java.util.Scanner;

public class TrianglePattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int n = sc.nextInt();

        StringBuilder pattern = new StringBuilder();

        for (int i = 0; i < n; i++) {
            pattern.append(" ".repeat(n - i - 1)); // spaces
            pattern.append("*".repeat(2 * i + 1)); // stars
            pattern.append("\n");
        }

        System.out.print(pattern);
    }
}
