package hi.baekjoon.greedy;

import java.io.*;

public class q01439 {
    //https://www.acmicpc.net/problem/1439
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String param = br.readLine();
        int result = solution(param);
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();

    }

    private static int solution(String param) {


        int tmp = -1; //뒤집는 횟수

        int one = 0;
        int zero = 0;

        char[] chs = param.toCharArray();
        for(int i =0 ; i<chs.length; i++) {
            if(chs[i] =='1' && tmp != 1) {
                one++;
                tmp =1;
            }
            else if(chs[i] == '0'&& tmp!=0){
                zero++;
                tmp = 0;
            }

        }

        if(one == 0 || zero == 0) {
            return 0;
        }
        return Math.min(one, zero);

    }
}
