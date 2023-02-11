package hi.baekjoon.greedy;

import java.io.*;

public class q01343 {
    //https://www.acmicpc.net/problem/1343
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String param = br.readLine();

        String result = solution(param);
        bw.write(result);


        bw.flush();
        bw.close();
        br.close();
    }

    private static String solution(String param) {
        String[] split = param.split("\\.");
        if(split.length ==0) {
            return param;
        }

        String param1 ="";
        String param2 ="";
        for(String s : split) {
            if(s != "\\.") {
                if(s.length() %2 == 1) {
                    return "-1";
                }
                else {
                    param1 = param.replaceAll("XXXX", "AAAA");
                    param2 = param1.replaceAll("XX", "BB");

                }
            }
        }
        return param2;

    }
}
