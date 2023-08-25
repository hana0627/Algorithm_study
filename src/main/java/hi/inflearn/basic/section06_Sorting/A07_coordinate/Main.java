package hi.inflearn.basic.section06_Sorting.A07_coordinate;

import java.util.Scanner;

public class Main {
    /*
    설명

    N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.

    정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.


    입력
    첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.

    두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.


    출력
    N개의 좌표를 정렬하여 출력하세요.


    예시 입력 1

    5
    2 7
    1 3
    1 2
    2 5
    3 6
    예시 출력 1

    1 2
    1 3
    2 5
    2 7
    3 6
     */


    public void solution(int size, int[][] arr) {
        System.out.println("size = " + size);
        for(int[] x : arr) {
            for(int i : x) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for(int k = 0; k< 2 ; k++) {
                arr[i][k] = sc.nextInt();
            }
        }

        T.solution(n, arr);

        sc.close();
    }

}


/*

//값은 나오는거 같은데 자꾸 틀렷다고 나옴
// 코드가 더러움 좀 풀이 살짝 보니까 더 이쁘게 풀이할 수 있음
    StringBuilder sb = new StringBuilder();

        boolean flag = true;
        for(int i = 0; i<size-2; i++) {
            if(arr[i] > arr[i+1]) {
                if(flag) {
                    sb.append(i+1 + " "); // 철수
                    flag = false;
                }
                else {
                    sb.append(i+2);
                }
            }
        }

        return sb.toString();

 */