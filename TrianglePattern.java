import java.util.Scanner;
public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(Utils.repeat(" ", n - i - 1));
            System.out.print(Utils.repeat("*", 2 * i + 1));
            System.out.println();
        }
    }
}
