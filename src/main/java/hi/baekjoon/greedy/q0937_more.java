package hi.baekjoon.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class q0937_more {
    //TODO 메모리초과
    //https://www.acmicpc.net/problem/9237
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String param1 = br.readLine();
        String param2 = br.readLine();
        int result = solution(param1, param2);

        bw.write(String.valueOf(result));


        bw.flush();
        bw.close();
        br.close();
    }

    private static int solution(String param1, String param2) {
        String[] s = param2.split(" ");
        // 자바 utils 말고 변환하는거... 뭐 계속 하다보면 나오겟지 모..
        List<Integer> list = new ArrayList<>();
        Arrays.stream(s).forEach(a -> list.add(Integer.parseInt(a)));

        //sort 함수없이 변환하기 -지그재그 ~_~
        int tmp = 0;
        for(int i =0 ; i < list.size(); i++) {
            for(int t = i+1; t<list.size(); t++ ) {
                if(list.get(i) < list.get(t)){
                    tmp = list.get(i);
                    list.set(i,list.get(t));
                    list.set(t,tmp);
                }
            }
        }
//        System.out.println("확인");
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }

        // 정렬 - end

        int result =0;
        int oneDay = 1;
        for(int i =0; i<list.size(); i++) {
            result++; //일단 하루가 지나면 result++
            list.set(i,list.get(i)+3);
        }

        Collections.sort(list);
        Collections.reverse(list);
//        System.out.println("확인2");
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }

        //System.out.println("리턴값 => " + list.get(0));
        return list.get(0);

    }

}
