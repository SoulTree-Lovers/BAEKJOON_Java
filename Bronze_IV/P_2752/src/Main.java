import java.util.Scanner;

import static java.util.Arrays.sort;

// 세수정렬
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        int[] arr = new int[3];

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        sort(arr);

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

    }
}