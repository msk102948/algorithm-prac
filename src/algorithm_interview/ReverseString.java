package algorithm_interview;

import java.util.Arrays;

/*
 * p.196 리트코드 344. Revers String
 *
 * 문자열을 뒤집는 함수를 작성하라. 입력값은 문자 배열이며, 리턴 없이 입력 배열 내부를 직접 조작하라.
 * 입력: ["r", "a", "c", "e", "c", "a", "r"]
 * 출력: ["r", "a", "c", "e", "c", "a", "r"]
 *
 */
public class ReverseString {
    public void reversStringCharArray(char[] s){
        int start = 0;
        int end = s.length - 1;

        // 서로 중앙으로 이동해 나가다 겹치는 지점에 도달하면 종료
        while (start < end){
            // 임시 변수를 이용해 값 스왑
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            // 앞쪽 문자는 한 칸 뒤로, 뒤쪽 문자는 한 칸 앞으로 이동
            start++;
            end--;
        }
        System.out.println("s = " + Arrays.toString(s));
    }
}
