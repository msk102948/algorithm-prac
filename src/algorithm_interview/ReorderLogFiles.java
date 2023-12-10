package algorithm_interview;

import java.util.ArrayList;
import java.util.List;

/*
*  p.199 리트코드 937. Reorder Log Files
*
* 로그를 재정렬하라. 기준은 다음과 같다.
* 1.로그의 가장 앞부분은 식별자로서, 순서에 영향을 끼치지 않는다.
* 2. 문자로 구성된 로그가 숫자 로그보다 앞에 오며, 문자로그는 사전순으로 한다.
* 3. 문자가 동일할 경우에는 식별자순으로 한다.
* 4. 숫자 로그는 입력 순서대로 한다.
*
* 입력: ["id1 8 1 5 1", "id2 art can", "id3 3 6", "id4 own kit dig", "id5 art zero"]
* 출력: ["id2 art can", "id5 art zero", "id4 own kit dig", "id1 8 1 5 1", "id3 3 6"]
*
*/
public class ReorderLogFiles {

    public static String[] reorderLogFiles(String[] logs){
        // 문자 로그를 저장할 문자 리스트
        List<String> letterList = new ArrayList<>();
        // 숫자 로그를 저장할 숫자 리스트
        List<String> digitList = new ArrayList<>();

        for(String log : logs){
            // 로그 종류 확인 후 숫자 로그라면 숫자 리스트에 삽입
            if(Character.isDigit(log.split(" ")[1].charAt(0))) {
                digitList.add(log);
            } else {
                // 숫자 로그가 아니라면 문자 리스트에 삽입
                letterList.add(log);
            }
        }
        // 문자 리스트 정렬 진행
        letterList.sort((s1, s2) -> {
            // 식별자와 식별자 외 나머지 부분, 이렇게 두 부분으로 나눈다.
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);

            // 문자 로그 사전순 비교
            int compared = s1x[1].compareTo(s2x[1]);
            // 문자가 동일한 경우 식별자 비교
            if(compared == 0) {
                return s1x[0].compareTo(s2x[0]);
            } else {
                // 비교 대상의 순서가 동일한 경우 0, 순서가 앞인 경우 1, 순서가 뒤인 경우 -1이 된다.
                return compared;
            }
        });

        // 문자 리스트 뒤로 숫자 리스트를 이어 붙인다.
        // 숫자 로그는 '입력 순서대로'라는 제약조건이 있으므로 따로 정렬하지 않는다.
        letterList.addAll(digitList);

        //리스트를 String 배열로 변환해 리턴한다.
        return letterList.toArray(new String[0]);
    }
}
