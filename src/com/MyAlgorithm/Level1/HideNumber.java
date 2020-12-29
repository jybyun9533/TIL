package com.MyAlgorithm.Level1;

/*<문제링크 : https://programmers.co.kr/learn/challenges?selected_part_id=12079>
 * 20.12.29.
 * String phone_number : 고객들의 전화번호
 * 뒷번호 4자리를 제외한 나머지는 *로 표시해여 출력
 * */

public class HideNumber {

    public String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length() - 4);

        return answer;
    }

}
