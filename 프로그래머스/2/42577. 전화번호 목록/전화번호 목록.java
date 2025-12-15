import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        // 전화번호부 정렬
        Arrays.sort(phone_book);
        
        // 다음 번호랑 비교해서 같으면 false 리턴
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        
        return true;
    }
}
// //startsWith()
// - boolean startsWith(String prefix)
// - startsWith() 함수는 대상 문자열이 특정 문자 또는 문자열로 시작하는지 체크하는 함수이다.
// - 해당 문자열로 시작되는지 여부를 확인하고 boolean에 맞춰 true/false 값을 리턴한다.