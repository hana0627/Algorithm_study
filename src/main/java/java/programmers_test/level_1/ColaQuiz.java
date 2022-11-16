package java.programmers_test.level_1;

public class ColaQuiz {

    
    // 해결못함 좀 더 고민필요
    class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;
            int rest = 0;

            while(n>=a){
                rest+= (n*b)%a;
                answer += (n/a)*b;

                //n = n/a;
                if(rest >= b){
                    rest = 0;
                    n = (n/a) +1;
                }else{
                    n = (n/a);
                }
            }

            return answer;
        }
    }
}
