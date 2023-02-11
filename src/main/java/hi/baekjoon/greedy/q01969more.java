package hi.baekjoon.greedy;

import java.io.*;

public class q01969more {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String a = br.readLine();
        int repeat = Integer.parseInt(a);
        String[] dna = new String[repeat];
        String b = br.readLine();
        int length = Integer.parseInt(b);
        char[] temp = new char[length];
        for(int i = 0; i <repeat; i++) {
            dna[i] = br.readLine();
        }
        //dna = ['TGTGTGTG','ACACACAC','ACAGT'...]

        logic(dna, length);

        bw.flush();
        bw.close();
        br.close();

    }


    private static String logic(String[] dna, int length) {
        int A = 0;
        int T = 0;
        int G = 0;
        int C = 0;

        for (String str : dna) {
            char[] arr = new char[str.length()];

            // 3. 반복문 (한글자씩 배열로 옮긴다)
            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i);
            }

        }
        return "1";

    }

}
