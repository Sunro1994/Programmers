import java.util.Scanner;

public class Main {
    static int N;
    static int K;
    static int[] arr;
    static int[] answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        arr = new int[N];
        answer = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort();

        if (K > count) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < N; i++) {
                System.out.print(answer[i] + " ");
            }
        }
    }

    static int count;

    private static void bubbleSort() {
        answer = arr.clone(); // 복사된 배열 생성

        for (int i = 0; i < N - 1; i++) {
            for (int y = 0; y < N - i - 1; y++) {
                if (answer[y] > answer[y + 1]) {
                    swap(y, y + 1, answer);
                    count++;
                }
                if (count == K) {
                    return;
                }
            }
        }
    }

    private static void swap(int y, int i, int[] arr) {
        int tmp = arr[y];
        arr[y] = arr[i];
        arr[i] = tmp;
    }
}
