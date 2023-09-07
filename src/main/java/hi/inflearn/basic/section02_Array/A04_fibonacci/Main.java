package hi.inflearn.basic.section02_Array.A04_fibonacci;

import java.util.Scanner;

public class Main {
    /*
    설명

    1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.

    2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.


    입력
    첫 줄에 총 항수 N(3<=N<=45)이 입력된다.


    출력
    첫 줄에 피보나치 수열을 출력합니다.

    예시입력 : 10
    예시출력 : 1 1 2 3 5 8 13 21 34 55
     */


    public int[] solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i<n ; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }

        // 배열을 사용하지 않고 해결하는법
//        int a = 1, b=1, c;
//        System.out.print(a+ " " + b + " ");
//        for(int i = 2; i<n; i++) {
//            c=a+b;
//            System.out.print(c + " ");
//            a=b;
//            b=c;
//        }

        return arr;

    }
    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        System.out.println(T.solution(n));
        long start = System.currentTimeMillis();
        for(int x : T.solution(n)) {
            System.out.print(x + " ");
        }
        long end = System.currentTimeMillis();

        System.out.println("\n소요시간 = " + (end - start));

        sc.close();
    }
}
