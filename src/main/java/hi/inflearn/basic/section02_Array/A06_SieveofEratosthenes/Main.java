package hi.inflearn.basic.section02_Array.A06_SieveofEratosthenes;

import java.util.Scanner;

public class Main {
    /*
    설명

    자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

    만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.


    입력
    첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.


    출력
    첫 줄에 소수의 개수를 출력합니다

    예시입력 : 20
    예시출력 : 8
     */


    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1]; // 0으로 초기화

        for(int i = 2; i<=n; i++) {
            if (ch[i] == 0) {
                answer++;
                // j는 i의 배수로 증가
                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }


        return answer;











        //STEP1. 2부터 n까지의 정수를 배열에 담는다.
//        int answer = 0;
//
//        List<Integer> list = new ArrayList<>();
//
//        for(int i = 1 ; i<=n ; i++) {
//            list.add(i);
//        }
//
//
//        //STEP2. 스트림 돌리면서 빼버리자! ˃ᴗ˂
//        /*
//        * 이 코드는 여러 개의 중첩된 filter 연산을 사용하여 소수를 찾고 있습니다.
//        * 각 filter 연산은 숫자 리스트를 반복적으로 검사하면서 조건을 적용하는 작업을 수행합니다.
//        * 이는 매우 비효율적일 수 있습니다. 왜냐하면 각 소수에 대해 일일이 그 배수들을 걸러내기
//        * 위해 여러 번의 모듈로 연산을 수행해야 하기 때문입니다.
//        * */
//        //에라토스테네스의 체를 통해 걸러내는 숫자는 2,3,5,7
//        List<Integer> result = list.stream()
//                .filter(i -> i != 1)
//                .filter(i -> i == 2 || i % 2 != 0)
//                .filter(i ->  i == 3 || i % 3 != 0)
//                .filter(i ->  i == 5 || i % 5 != 0)
//                .filter(i ->  i == 7 || i % 7 != 0)
//                .filter(i ->  i == 11 || i % 11 != 0).toList();
//        answer = result.size();
//        return answer;

    }
    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(T.solution(n));

        sc.close();
    }
}
