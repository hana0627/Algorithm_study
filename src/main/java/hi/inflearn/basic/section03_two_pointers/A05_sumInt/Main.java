package hi.inflearn.basic.section03_two_pointers.A05_sumInt;

import java.util.Scanner;

public class Main {
    /*
  설명

    N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.

    만약 N=15이면

    7+8=15

    4+5+6=15

    1+2+3+4+5=15

    와 같이 총 3가지의 경우가 존재한다.


    입력
    첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.


    출력
    첫 줄에 총 경우수를 출력합니다.


    예시입력 : 15
    예시출력 : 3

     */



    public int solution (int n) {
        int answer = 0;
        int m = n/2 +1;
        int lt = 0;
        
        // 배열로 생성
        int[] ints = new int[m];
        for(int i = 1; i<= m ; i++) {
            ints[i-1] = i;
        }

        int sum = 0;
        // two-pointer 알고리즘
        for(int rt = 0; rt< m ; rt++) {
            sum += ints[rt];

            if(sum == n) {
                answer++;
            }

            while(sum >= n) {
                sum -= ints[lt++];
                if(sum == n) {
                    answer++;
                }
            }


        }

        return answer;


    }



    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(T.solution(n));

        sc.close();
    }
}



/*
        int tmp = n/2 +1;
        int answer = 0;
        int sum = 0;

        // 이중 for-loop?
        // n에서 break 걸리면 복잡도가 그렇게 높아질까
        // 그래도 two-point로 풀어보자
        // N이 1000까지인 경우에 한해서 이게 미세하게 빨랐음
        
        
        for(int i = 1; i<=tmp ; i++) {
            for(int k = i; k<=tmp; k++) {
                sum += k;
                if(sum == n) {
                    answer ++;
                    sum = 0;
                    break;
                }
                if(sum >= n) {
                    sum = 0;
                    break;
                }
            }
        }






 */
