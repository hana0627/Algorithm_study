package hi.baekjoon.greedy;

import java.io.*;

public class q10162 {
    //https://www.acmicpc.net/problem/10162
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String param = br.readLine();

        String result = logic(Integer.parseInt(param));

        bw.write(result);

        bw.flush();
        bw.close();
        br.close();

    }

    private static String logic(int param) {
        int fiveMinBtn = 0;
        int oneMinBtn = 0;
        int tenSecBtn = 0;
        String result;

        int tmp = param;
        while(true) {
            if(tmp >= 300) {
                fiveMinBtn ++;
                tmp -=300;
            }
            else if(tmp >= 60) {
                oneMinBtn ++;
                tmp -= 60;
            }
            else if(tmp >= 10) {
                tenSecBtn++;
                tmp -=10;
            }
            else if(tmp ==0) {
                break;
            }
            else if(tmp %10 != 0.0) {
                return "-1";
            }
        }
        result = String.valueOf(fiveMinBtn) +" " + String.valueOf(oneMinBtn) + " " + String.valueOf(tenSecBtn);
        return result;

    }
}
