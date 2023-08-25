package hi.inflearn.basic.section06_Sorting.A01_selection_sort;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    /*
   1. 선택 정렬
    설명

    N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.

    정렬하는 방법은 선택정렬입니다.


    입력
    첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.

    두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.


    출력
    오름차순으로 정렬된 수열을 출력합니다.


    예시 입력 1

    6
    13 5 11 7 23 15
    예시 출력 1

    5 7 11 13 15 23
     */



    public void solution (int n, int[] arr) {
        StringBuilder sb = new StringBuilder();

        
        // 시간복잡도 관계상 선호하진 않으나, 문제 제목이 선택정렬인 만큼
        // 선택정렬 풀이법으로 작성
        int tmp = 0;
        for(int i = 0; i<n; i++) {
            for(int k = i ; k<n; k++) {
                if (arr[i] > arr[k]) {
                    tmp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = tmp;
                }
            }
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }

    }



    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        T.solution(n, arr);

        sc.close();
    }

}

