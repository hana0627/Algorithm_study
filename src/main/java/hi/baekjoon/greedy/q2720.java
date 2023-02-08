package hi.baekjoon.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class q2720 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        for(int i =0; i <repeat; i++) {
            String a = br.readLine();
            String result = calculate(Integer.parseInt(a));
            list.add(result);
        }

        list.stream().forEach(System.out::println);




        bw.flush();
        bw.close();
        br.close();

    }


    private static String calculate(int cent) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        double tmp = cent;
        while(true) {
            if(tmp >= 25){
                a++;
                tmp -= 25;
            }
            else if(tmp >= 10){
                b++;
                tmp -= 10;
            }
            else if(tmp >= 5){
                c++;
                tmp -= 5;
            }
            else if(tmp >= 1){
                d++;
                tmp -= 1;
            }else if(tmp ==0) {
                break;
            }
        }
        String result = String.valueOf(a) +" " + String.valueOf(b)+" " + String.valueOf(c)+" " + String.valueOf(d);
        return result;
    }
}
