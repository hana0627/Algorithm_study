package hi.inflearn.basic.section05_Stack_Queue.A04_postfix;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    /*
   설명

    후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.

    만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.


    입력
    첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.

    식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.


    출력
    연산한 결과를 출력합니다.


    예시 입력 1

    352+*9-

    2+5

    예시 출력 1

    12
     */



    public int solution (String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack();

        int a,b = 0;
        char[] chrs = str.toCharArray();
        for(char c : chrs) {
            if (Character.isDigit(c)) {
                stack.push(c - 48);
            } else {
                b = stack.pop();
                a = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    default:
                        stack.push(a / b);
                }
            }
        }

        answer = stack.pop();

        return answer;

    }



    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();



        System.out.print(T.solution(str));

        sc.close();
    }
}
