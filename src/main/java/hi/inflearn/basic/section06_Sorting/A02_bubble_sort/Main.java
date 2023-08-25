package hi.inflearn.basic.section06_Sorting.A02_bubble_sort;

import java.util.Scanner;

public class Main {
    /*
    설명

    N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.

    정렬하는 방법은 삽입정렬입니다.


    입력
    첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.

    두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.


    출력
    오름차순으로 정렬된 수열을 출력합니다.


    예시 입력 1

    6
    11 7 5 6 10 9
    예시 출력 1

    5 6 7 9 10 11
     */



    public String solution (int n, int[] arr) {
        StringBuilder sb = new StringBuilder();


        // 버블정렬 사용
        int tmp = 0;
        for(int i = 0; i<n-1; i++) {
            for(int k = 0; k<n-1-i ; k++ ) {
                if(arr[k] > arr[k+1]) {
                    tmp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = tmp;
                }
            }
        }
        for(int i : arr) {
            sb.append(i + " ");
        }


        return sb.toString();

    }



    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(n, arr));

        sc.close();
    }

}

