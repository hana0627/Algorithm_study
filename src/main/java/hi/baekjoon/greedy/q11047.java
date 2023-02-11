package hi.baekjoon.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class q11047 {
    //https://www.acmicpc.net/problem/11047
    // TODO 반례못찾겠음
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String param1 = br.readLine();
        String[] s = param1.split(" ");
        List<Integer> list = new ArrayList<>();
        int ints[] = new int[Integer.parseInt(s[0])];
        for(int i = 0; i<Integer.parseInt(s[0]); i++) {
            ints[i] = Integer.parseInt(br.readLine());
        }

        int result = solution(Integer.parseInt(s[1]), ints);
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
    private static int solution(int total,int[] list) {

        int tmp = 0;
        for(int i =0 ; i < list.length; i++) {
            for(int t = i+1; t<list.length; t++ ) {
                if(list[i] < list[t]){
                    tmp = list[i];
                    list[i] = list[t];
                    list[t] = tmp;
                }
            }
        }

        System.out.println("여기확인");
        for (Integer integer : list) {
            System.out.println(integer);
        }

        int result = 0;

        tmp = total;
        while(true) {
            System.out.println("빙글빙글");
            for(int i =0; i < list.length; i++) {
                if(tmp>=list[i]) {
                    tmp -= list[i];
                    result++;
                    System.out.println("tmp -> " + tmp);
                    System.out.println("result -> " + result);
                    break;
                }
                if(tmp == 0) {
                    return result;
                }
            }
        }

    }
}
