//장르, 재생수
//고유번호, 재생수

//    classic   |    pop
//   0,  2,  3  |   1,  4
//  500,150,800 |  600,2500

//1. 장르별 조회수를 정렬
//2. 장르에 속한 노래의 (고유번호,재생수)를 재생수 기준으로 정렬
//3. 재생횟수가 같으면 고유번호 오름차순
import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        //1.변수 선언
        //장르(고유번호, 재생수)
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>();
        //장르, 재생수
        HashMap<String, Integer> genreTotalPlays = new HashMap<>();
        
        //2.데이터 넣기
        for (int i = 0; i < genres.length; i++) {
            
            if (!music.containsKey(genres[i])) {//새로운 장르일 경우
                music.put(genres[i], new HashMap<>());//빈칸 생성
                genreTotalPlays.put(genres[i], 0);//총점 기본 0으로 시작
            }
            //music 데이터 저장
            music.get(genres[i]).put(i, plays[i]);//music에서 해당 장르 (고유번호,재생수)저장
            
            //장르별 총재생수 저장
            genreTotalPlays.put(genres[i], genreTotalPlays.get(genres[i]) + plays[i]);//현재 노래의 재생수 더함
        }
        
        //3.
        //장르 이름들만 뽑아서 리스트 만들기
        List<String> keySet = new ArrayList<>(genreTotalPlays.keySet());
        //장르별 재생 수를 내림차수능로 정렬
        Collections.sort(keySet, (s1, s2) -> genreTotalPlays.get(s2) - genreTotalPlays.get(s1));
        
        //4.
        ArrayList<Integer> result = new ArrayList<>();//결과를 담을 리스트
        
        //정렬된 순서대로 읽을거임
        for (String genre : keySet){
            //해당 장르의 노래목록 맵 가져오기
            HashMap<Integer, Integer> map = music.get(genre);//(고유번호,재생수)
            
            //노래 고유번호만 뽑아서 리스트 만듦
            List<Integer> genreKeySet = new ArrayList<>(map.keySet());//**keySet()<-모든 키값을 가져오기**
            
            //genreKeySet 정렬시키기
            Collections.sort(genreKeySet, (id1, id2) -> {
                
                int play1 = map.get(id1); // 첫 번째 노래의 재생수
                int play2 = map.get(id2); // 두 번째 노래의 재생수
        
                // 재생 횟수가 같을때(예외)
                //고유번호 비교
                if (play1 == play2) {
                    return id1 - id2; // 고유번호가 작은 순 (오름차순)
                }
                // 재생 횟수가 다를때
                //재생 횟수 비교
                return play2 - play1; // 재생횟수가 많은 순 (내림차순)
            });
            
            //최대 2곡 수록 조건
            result.add(genreKeySet.get(0)); // 1등 곡 수록
            if (genreKeySet.size() > 1) {   // 2등 곡이 있다면 수록
                result.add(genreKeySet.get(1));
            }
        }
            // 5. 
            // ArrayList를 int[] 배열로 변환해서 리턴하기
            int[] answer = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }

            return answer;

    }
}