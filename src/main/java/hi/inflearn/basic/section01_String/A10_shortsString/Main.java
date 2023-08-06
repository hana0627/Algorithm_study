package hi.inflearn.basic.section01_String.A10_shortsString;

import java.util.Scanner;

public class Main {
    /*
    설명

    한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


    입력
    첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

    문자열의 길이는 100을 넘지 않는다.


    출력
    첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다

    예시입력 : teachermode e

    예시출력 : 1 0 1 2 1 0 1 2 2 1 0

     */

    
    public String solution(String str, char ch) {
        String answer;

        int temp = 1000; // 그냥 임의의 큰 값

        char[] chs = str.toCharArray();

        //rightInteger
        //leftInteger
        int[] result = new int[str.length()];

        // 왼쪽의 ch로부터의 거리
        for(int i = 0; i <chs.length; i++) {
            if(chs[i] == ch) {
                temp = 0;
            }
            else {
                temp++;
            }
            result[i] = temp;
        }

        // 오른쪽의 ch로부터의 거리
        temp = 1000;
        for(int i = chs.length-1; i >= 0 ; i--) {
            if(chs[i] == ch) {
                temp = 0;
            }
            else {
                temp++;
                result[i] = Math.min(result[i], temp);
            }
            // 어느값이 더 작은지 계산
//            if(temp < result[i]) {
//                result[i] = temp;
//            }else {
//                result[i] = result[i];
//            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i : result) {
            sb.append(i + " ");
        }
        answer = sb.toString();
        return answer;




    }
    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);

        System.out.println(T.solution(str, ch));
        sc.close();
    }
}



//        // 왼쪽의 ch로부터의 거리
//        for(int i = 0; i <chs.length; i++) {
//            if(chs[i] == ch) {
//                temp = 0;
//            }
//            else {
//                temp++;
//            }
//            ri[i] = temp;
//
//        }
//
//        // TODO 여기서 한번에 해결 가능해보임
//        // 오른쪽의 ch로부터의 거리
//        temp = 1000;
//        for(int i = chs.length; i > 0 ; i--) {
//            if(chs[i-1] == ch) {
//                temp = 0;
//            }
//            else {
//                temp++;
//            }
//
//            li[i-1] = temp;
//        }
//
//        // 결과에 작은값을 대입
//        int[] result = new int[str.length()];
//        for(int i = 0; i<chs.length; i++) {
//            if(ri[i] > li[i]) {
//                result[i] = li[i];
//            }
//            else {
//                result[i] = ri[i];
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int i : result) {
//            sb.append(i + " ");
//        }
//        answer = sb.toString();
//        return answer;

