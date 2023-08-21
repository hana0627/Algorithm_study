package hi.inflearn.basic.section03_two_pointers.A06_MaxConsecutiveNumberSS2;

import java.util.Scanner;

public class Main {
    /*
    설명

    0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.

    만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면

    1 1 0 0 1 1 0 1 1 0 1 1 0 1

    여러분이 만들 수 있는 1이 연속된 연속부분수열은


    이며 그 길이는 8입니다.


    입력
    첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.

    두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.


    출력
    첫 줄에 최대 길이를 출력하세요.


    예시입력
    14 2
    1 1 0 0 1 1 0 1 1 0 1 1 0 1

    예시출력
    8


     */



    public int solution (int n, int m, int[] arr) {
        //TODO 다시한번 풀어보기

    }



    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(n,m,arr));

        sc.close();
    }
}

/*

 int answer = 0, cnt  =0, lt =0;
        for(int rt = 0; rt<n; rt++) {
            if(arr[rt] == 0 ) {
                cnt++;

                while(cnt>m) {
                    if(arr[lt] == 0) {
                        cnt--;
                        lt++;
                    }
                }
            }

            answer = Math.max(answer, rt-lt);

        }

        return answer;



// 어렵다.
   int answer = 0;
        int sum = 0;
        int lt = 0;

        int tmp = 0;

        for(int rt = 0; rt<n; rt++) {
            sum += arr[rt];
            if(arr[rt] == 0 ) {
                tmp++; sum++;
            }

            if(arr[lt] == 0 ) {
                tmp--; sum--;
            }

            if(tmp > m) {
                tmp--;
                sum -= arr[lt++];
            }
        }

        return sum;

 */