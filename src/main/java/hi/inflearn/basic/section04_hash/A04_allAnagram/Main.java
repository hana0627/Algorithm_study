package hi.inflearn.basic.section04_hash.A04_allAnagram;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    /*
    설명

    S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.

    아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.


    입력
    첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.

    S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.


    출력
    S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.


    예시 입력 1

    bacaAacba
    abc

    예시출력 : 3

     */



    public int solution (String str1, String str2) {

        int answer = 0;

        char[] arr1 = str1.toCharArray();
        char[] car2 = str2.toCharArray();
        int m = car2.length -1;

        Map<Character, Integer> am = new HashMap<>(); //aMap
        Map<Character, Integer> bm = new HashMap<>(); //bMap

        for(char c : car2) {
            bm.put(c,bm.getOrDefault(c,0)+1);
        }

        for(int i = 0; i<car2.length-1; i++) {
            am.put(arr1[i],am.getOrDefault(arr1[i],0)+1);
        }

        int lt = 0;
        for(int rt = m; rt<arr1.length; rt++) {
            am.put(arr1[rt],am.getOrDefault(arr1[rt],0)+1);
            if(am.equals(bm)) {
                answer++;
            }

            am.put(arr1[lt],am.get(arr1[lt])-1);
            if(am.get(arr1[lt]) == 0 ) {
                am.remove(arr1[lt]);
            }
            lt++;
        }


        return answer;


    }



    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        String str1 =sc.next();
        String str2 =sc.next();

        System.out.print(T.solution(str1, str2));

        sc.close();
    }
}

