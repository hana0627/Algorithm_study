package hi.inflearn.basic.section05_Stack_Queue.A02_bracketText;

import java.util.Scanner;
import java.util.Stack;
public class Main {
    /*
    설명

    입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.


    입력
    첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.


    출력
    남은 문자만 출력한다.


    예시 입력 1

    (A(BC)D)EF(G(H)(IJ)K)LM(N)
    예시 출력 1

    EFLM
     */



    public String solution (String str) {

        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack();

        char[] chrs = str.toCharArray();
        for(char c : chrs) {
            if(c ==')') {
                while(stack.pop() != '(') {}

            }
            else {
                stack.push(c);
            }
        }


        for(int i = 0; i<stack.size(); i++ ) {
            sb.append(stack.get(i));
        }


        return sb.toString();



    }



    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        String str=sc.next();

        System.out.print(T.solution(str));

        sc.close();
    }
}

/*

굳이 스택이라는 자료구조를 사용해야해...??
그래도 연습이니깐..

        StringBuilder sb = new StringBuilder();

        char[] chrs = str.toCharArray();

        int cnt = 0;
        for(char c : chrs) {
            if(c =='(') {
                cnt++;
            }
            else if(c ==')') {
                cnt--;
            }

            else if(cnt ==0) {
                sb.append(c);
            }
        }

        return sb.toString();


 */