package hi.baekjoon.greedy;

import java.io.*;

public class q14916 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String s = br.readLine();
        int money = Integer.parseInt(s);
        int result = solution(1000 - money);
        bw.write(String.valueOf(result));


        bw.flush();
        bw.close();
        br.close();

    }

    private static int solution(int num) {
        int a =0; //500
        int b =0; //100
        int c =0; //50
        int d =0; //10
        int e =0; //5
        int f =0; //1

        while (true) {
            if(num >= 500){
                a++;
                num-=500;
            }else if(num >= 100){
                b++;
                num -=100;
            }else if(num >= 100){
                b++;
                num -=100;
            }else if(num >= 50){
                c++;
                num -=50;
            }else if(num >= 10){
                d++;
                num -=10;
            }else if(num >= 5){
                e++;
                num -=5;
            }else if(num >= 1){
                b++;
                num -=1;
            }
            else{
                break;
            }
        }
        return a+b+c+d+e+f;
    }

}

