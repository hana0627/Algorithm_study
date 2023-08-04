package hi.inflearn.basic.section01_String.A02_convert;

import java.util.Scanner;

        /*
       설명
        대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.


        입력
        첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.

        문자열은 영어 알파벳으로만 구성되어 있습니다.
        */

public class Main {

    public String solution(String str) {

        char[] chars = str.toCharArray();
//        char[] chars2 = new char[]{};
        int asckii = 0 ;
        for(int i =0; i<chars.length; i++) {
            asckii = (int) chars[i];
            //A~Z : 65~90
            // 대문자인경우
            if(asckii>=65 && asckii<=90) {
                asckii += 32;
            }
            //a_z : 97 : 122
            // 소문자인경우
            else if(asckii>=97 && asckii<=122) {
               asckii -= 32;
            }
            chars[i] = (char) asckii;

        }

        String answer = String.valueOf(chars);

        return answer;
    }
    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //아스키코드이용?
        System.out.println(T.solution(str));

    }
}
