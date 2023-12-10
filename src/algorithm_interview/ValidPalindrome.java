package algorithm_interview;

/*
 * p.188 리트코드 125. Valid Palindrome
 *
 * 주어진 문자열이 팰린드롬인지 확인하라. 대소문자를 구분하지 않으며, 영숫자(영문자와 숫자)만을 대상으로 한다."
 * 입력: "Do geese see God?"
 * 출력: true
 *
 * [참고] 팰린드롬: 앞뒤가 똑같은 단어나 문장(로꾸꺼)
 */
public class ValidPalindrome {
    public boolean isPalindromeCharArray(String str){

        int start = 0;
        int end = str.length() - 1;

        while (start < end){
            // 영숫자인지 판별하고 유효하지 않으면 한 칸씩 이동
            if(!Character.isLetterOrDigit(str.charAt(start))) {
                start ++;
            } else if(!Character.isLetterOrDigit(str.charAt(end))) {
                end--;
            } else { // 유효한 문자라면 앞 글자와 뒷글자를 모두 소문자로 변경해 비교
                if(Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
                    // 하나라도 일치하지 않는다면 팰린드롬이 아니므로 false 리턴
                    return false;
                }
                // 앞쪽 문자는 한 칸 뒤로, 뒤쪽 문자는 한 칸 앞으로 이동
                start++;
                end--;
            }
        }
        // 무사히 종료될 경우 팰린드롬이므로 true 리턴
        return true;
    }

    public boolean isPalindromeString(String str) {
        // 정규식으로 유효한 문자만 추출한 다음 모두 소문자로 변경
        String s_filtered = str.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        // 문자열을 뒤집은 다음 String으로 변경
        String s_reversed = new StringBuilder(s_filtered).reverse().toString();
        // 두 문자열이 동일한지 비교
        return s_filtered.equals(s_reversed);
    }

}
