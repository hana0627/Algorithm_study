package hi.inflearn.basic.section02_Array.A03_gababo;

import java.util.Scanner;

public class Main {
    /*
  설명

    A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.

    가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.

    예를 들어 N=5이면

    회수      |  1  |  2  |  3  |  4  |  5
    A의점수   |  2  |  3  |  3  |  1  |  3
    A의점수   |  1  |  1  |  2  |  2  |  3
    A의점수   |  A  |  B  |  A  |  A  |  D

    두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.


    입력
    첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.

    두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.

    세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.


    출력
    각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.


    예시입력
        5
        2 3 3 1 3
        1 1 2 2 3

    예시출력
        A
        B
        A
        B
        D
     */


    public String solution(int n, int[] arr1, int[] arr2) {
        //1:가위, 2:바위, 3:보로 정하겠습니다.
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<n ; i++) {
            if(arr1[i] == arr2[i]) {
                sb.append("D");
            }
            else if(arr1[i] == 1 && arr2[i]== 3) {
                sb.append("A");
            }
            else if(arr1[i] == 2 && arr2[i]== 1) {
                sb.append("A");
            }
            else if(arr1[i] == 3 && arr2[i]== 2) {
                sb.append("A");
            }
            else {
                sb.append("B");
            }
//            else if(arr1[i]<arr2[i] && arr2[i]!= 1) {
//                answer.add("B");
//            }
//            else if(arr2[i]== 1 && arr1[i] == 3) {
//                answer.add("B");
//            }
//            else {
//                answer.add("A");
//            }
        }
        answer = sb.toString();

        return answer;

    }
    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i =0; i<n ; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i =0; i<n ; i++) {
            arr2[i] = sc.nextInt();
        }
        for(char x : T.solution(n,arr1,arr2).toCharArray()) {
            System.out.println(x);
        }

        sc.close();
    }
}
