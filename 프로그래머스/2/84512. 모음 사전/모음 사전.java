//1. dfs로 사전에 있는 단어 모두 만들어 놓음
//2. 단어를 리스트에 저장해둠
//3. 입력받은 단어를 리스트에서 찾아서 인덱스 리턴

import java.util.*;

class Solution {
    // 1. 모든 단어를 저장할 리스트 생성
    List<String> list = new ArrayList<>();
    String[] alphabet = {"A", "E", "I", "O", "U"};

    public int solution(String word) {
        // 2. dfs로 모든 단어 생성
        dfs("", 0);
        
        // 3. 리스트에서 해당 단어의 인덱스를 찾음 
        // 빈 문자열을 인덱스0에 넣어둬서 바로 인덱스로 결과값 리턴
        return list.indexOf(word);
    }

    // dfs (현재 단어, 현재 길이)
    public void dfs(String str, int len) {
        // 리스트에 추가
        list.add(str);
        
        // 길이가 5가 되면 끝
        if (len == 5) {
            return;
        }

        // A~U까지 순서대로 붙여서 호출
        for (int i = 0; i < 5; i++) {
            dfs(str + alphabet[i], len + 1);
        }
    }
}