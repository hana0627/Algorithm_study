package hi.inflearn.basic.section05_Stack_Queue.A01_bracket;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    /*
   설명

    괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.

    (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.


    입력
    첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.


    출력
    첫 번째 줄에 YES, NO를 출력한다.


    예시 입력 1

    (()(()))(()
    예시 출력 1

    NO
     */



    public String solution (String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        char[] chrs = str.toCharArray();
        for(char c : chrs) {
            if(c == '(') {
                stack.push('(');
            }
            if(c == ')') {
                if(stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()) {
            return "NO";
        }

        return answer;

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

// 좀 더 멋찌게 풀어보면
        String answer = "YES";
        int cnt = 0; // '('의 숫자
        char[] chrs = str.toCharArray();

        for(char c : chrs) {
            if(c == '(') {
                cnt++;
            }
            if(c == ')') {
                cnt--;
            }


            if(cnt<0) {
                return "NO";
            }

        }
        if(cnt != 0) {
            return "NO";
        }
        return answer;
 */

/*
String answer = "YES";
        int i1 = 0; // '('의 숫자
        int i2 = 0; // ')'의 숫자
        char[] chrs = str.toCharArray();

        for(char c : chrs) {
            if(c == '(') {
                i1++;
            }
            if(c == ')') {
                i2++;
            }


            if(i2>i1) {
                return "NO";
            }

        }
        if(i1 != i2) {
            return "NO";
        }
        return answer;
        
 */