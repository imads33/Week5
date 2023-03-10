import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new arr[n];
        int num = 50;

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else {
                    int temp = arr[i] + arr[j];
                    for (int k = 0; k < n; k++) {
                        if (temp == arr[k]) {
                            System.out.println(arr[k]);
                            break;
                        }
                    }
                }
            }
        }
    }
}