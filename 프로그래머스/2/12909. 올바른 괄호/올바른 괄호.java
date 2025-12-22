class Solution {
    boolean solution(String s) {
        //문자를 하나씩 읽으며 "("이면 +1, ")"이면 -1해서
        //최종 0이 되면 true 리턴 아니면 flase 리턴
        //중간에 음수가 된다(닫는 괄호가 나온다.)면 무조건 false
        
        int res = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // 문자를 하나씩 확인
            char c = s.charAt(i);

            if (c == '(') { //(이면+1
                res++;
            } else {    //)이면 -1
                res--;
            }
            
            if (res < 0) { //음수가 된다면 무조건 false 
                return false;
            }
            
        }

        return res == 0;
    }
}