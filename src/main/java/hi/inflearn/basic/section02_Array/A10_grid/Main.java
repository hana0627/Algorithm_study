package hi.inflearn.basic.section02_Array.A10_grid;

import java.util.Scanner;

public class Main {
    /*
    5*5 격자판에 아래와 같이 숫자가 적혀있습니다.
    이미지

    N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


    입력
    첫 줄에 자연수 N이 주어진다.(2<=N<=50)

    두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


    출력
    최대합을 출력합니다.

    예시입력
    5
    10 13 10 12 15
    12 39 30 23 11
    11 25 50 53 15
    19 27 29 37 27
    19 13 30 13 19

    예시출력
    155

     */



    public int solution (int n, int[][] arr) {


        // 이렇게 변수 네개 선언하는거 맞냐??
        int answer = 0;
        int tmp1 = 0; // 열의합
        int tmp2 = 0; // 행의합
        int tmp3 = 0;
        int tmp4 = 0;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n ; j++) {
                tmp1 += arr[i][j];
                tmp2 += arr[j][i];
            }
            answer = Math.max(answer,tmp1);
            answer = Math.max(answer,tmp2);



            tmp3 += arr[i][i];
            tmp4 += arr[i][4-i];
            answer = Math.max(answer,tmp3);
            answer = Math.max(answer,tmp4);

            tmp1 = 0; tmp2 =0;
        }

        return answer;

    }



    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i =0; i<n ; i++) {
            for(int j =0; j<n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.solution(n, arr));

        sc.close();
    }
}
