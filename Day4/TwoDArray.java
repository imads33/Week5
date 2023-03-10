import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean flag = false;
        System.out.println("Enter the number of rows and columns");
        n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] >= 10 && arr[i][j] != 20) {
                    System.out.println("No");
                    flag = true;
                    break;
                }
            }
        }
        if (flag == false) {
            System.out.println("Yes");
        }
    }
}