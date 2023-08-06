package hi.inflearn.basic.section01_String.A09_number;


import java.util.Scanner;

public class Main {
    /*
    설명

    문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.

    만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.

    추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.


    입력
    첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.


     */

    public String solution(String str) {
        String answer = "";
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        // 숫자만 추출
        for(char c : chars) {
            //Character.isDigit(c);
            if(!Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }

        // 맨앞의 0 제거
//        while(true) {
//            if(sb.charAt(0) == '0') {
//                sb.delete(0,1);
//            }
//            else {
//                break;
//            }
//        }

        //위처럼 while loop를 돌리는것 보다는 Int 형변환이 훨씬 깔끔해보인다
        answer = sb.toString();
        return String.valueOf(Integer.parseInt(answer));


        //강의해설
//        int result = 0;
//        for(char x : str.toCharArray()) {
//            if(x>=48 && x<=57) {
//                answer += result*10 + (x-48);
//            }
//        }


//        return answer;


    }
    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(T.solution(str));
        sc.close();
    }
}
