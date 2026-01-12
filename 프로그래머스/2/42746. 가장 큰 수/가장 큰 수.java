import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        
        // 1. 숫자 배열을 문자열 배열로 변환
        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }

        // 2. Arrays.sort 고속정렬
        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // (뒤+앞) 과 (앞+뒤)를 비교
                // o2+o1이 더 크면 양수를 반환하여 자리를 바꿈
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        
        // ***0만 있는 경우 예외
        // 입력이 [0, 0]일 때 "0"이 나와야함
        if (result[0].equals("0")) {
            return "0";
        }
        
        
        // 3. 문자열 합치기
        StringBuilder sb = new StringBuilder();
        for (String s : result) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}
// 원래 풀었던 방식..시간초과 실패
//class Solution {
//    public String solution(int[] numbers) {
//        // 1. 숫자 배열을 문자열 배열로 바꾼다.
//        String[] result = new String[numbers.length];
//        for (int i = 0; i < numbers.length; i++) {
//            result[i] = String.valueOf(numbers[i]);
//        }
//
//        // 2. 버블 정렬
//        //이중반복문으로 하나씩 숫자를 뒷 숫자와 비교하여 자리를 바꾼다.. 
//        //i가 한번 반복될 때마다 맨 뒤부터 숫자가 확정된다.
//        for (int i = 0; i < result.length - 1; i++) {
//            for (int j = 0; j < result.length -1-i; j++) {
//                
//                String a = result[j];     
//                String b = result[j + 1];
//
//                if ((a + b).compareTo(b + a) < 0) {//현재 순서가 앞뒤 바꾼것 보다 작은 수라면
//                    //(예. 10+6=106과 6+10=610을 비교하여 큰 수를 만들 수 있는 10을 뒤로 민다.)
//                    //위치를 바꾼다.
//                    String temp = result[j];
//                    result[j] = result[j + 1];
//                    result[j + 1] = temp;
//                }
//            }
//        }
//        // 3. 문자열로 합치기
//        StringBuilder sb = new StringBuilder();
//        for (String s : result) sb.append(s);
//        
//        return sb.toString();
//    }
//}
