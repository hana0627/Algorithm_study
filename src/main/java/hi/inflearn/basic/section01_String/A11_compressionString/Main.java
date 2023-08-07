package hi.inflearn.basic.section01_String.A11_compressionString;

import java.util.Scanner;

public class Main {
    /*
    설명

    알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는

    문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.

    단 반복횟수가 1인 경우 생략합니다.


    입력
    첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.


    출력
    첫 줄에 압축된 문자열을 출력한다

    예시입력1 : KKHSSSSSSSE
    예시출력1 : K2HS7E
    예시입력2 : KSTTTSEEKFKKKDJJGG
    예시출력2 : KST3SE2KFK3DJ2G2

     */


    public String solution(String str) {
        String answer;
        // 마지막 i+1 비교를 위해 빈문자 한개 넣어주어야함
        str = str + " ";

        int temp = 1;
        char[] chs = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< chs.length-1; i++) {

            if(chs[i] == chs[i+1]) {
                temp++;
            }else{
                sb.append(chs[i]);
                if(temp != 1) {
                    sb.append(temp);
                }
                temp = 1;
            }
        }


        answer = sb.toString();

        return answer;




    }
    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(T.solution(str));
        sc.close();
    }
}
