package hi.inflearn.basic.section01_String.A05_ReverseSomeWord;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    설명

    영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

    특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


    입력
    첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


    출력
    첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
     */

    public String solution(String str) {

        String answer;

        char[] chrs = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while (lt < rt) {

        }






//        char[] chars = str.toCharArray();
//        List<Integer> indexs = new ArrayList<>();
//
//        for(int i = 0; i<chars.length; i++) {
//            char ch = chars[i];
//
//            //찾아보니까 아래같은 함수도 있더라. isAlphabetic
//            //Character.isAlphabetic(chars[i]);
//            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ) {
//            System.out.println(ch+"는 알파벳!!");
//                indexs.add(i);
//            }
//        }
//
//        int temp = 0;
//        char[] tempChars = new char[indexs.size()];
//        for(int i = 0; i<indexs.size(); i++) {
//            temp = indexs.get(indexs.size()-i-1);
//            tempChars[i] = chars[temp];
////            chars[indexs.get(i)] = chars[temp];
//        }
//
//        return String.valueOf(tempChars);

    }
    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //정규식?
        System.out.println(T.solution(str));

    }
}
