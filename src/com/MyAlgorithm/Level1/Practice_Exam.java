package com.MyAlgorithm.Level1;

/*
 * <문제정의 : https://programmers.co.kr/learn/courses/30/lessons/42840>
 * 1번 수포자 찍는 방식 : 1,2,3,4,5 반복
 * 2번 수포자 찍는 방식 : 2,1,2,3,2,4,2,5 반복
 * 3번 수포자 찍는 방식 : 3,3,1,1,2,2,4,4,5,5 반복
 * 시험은 최대 10,000 문제
 * 정답은 1,2,3,4,5 중 하나
 * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬
 * */


public class Practice_Exam {

    public static int[] solution(int[] answers) {
        // 각 학생별 답안 패턴
        int[] student1_pattern = {1, 2, 3, 4, 5};
        int[] student2_pattern = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3_pattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 각 학생 별 정답 갯수 : [1번, 2번, 3번]
        int[] student_answer = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1_pattern[i % student1_pattern.length]) {
                student_answer[0]++;
            }
            if (answers[i] == student2_pattern[i % student2_pattern.length]) {
                student_answer[1]++;
            }
            if (answers[i] == student3_pattern[i % student3_pattern.length]) {
                student_answer[2]++;
            }
        }

        int max = Math.max(student_answer[0], Math.max(student_answer[1], student_answer[2]));

        if (student_answer[0] == student_answer[1] && student_answer[0] == student_answer[2]) {
            return new int[]{1, 2, 3};
        } else if (student_answer[0] == student_answer[1] && student_answer[0] > student_answer[2]) {
            return new int[]{1, 2};
        } else if (student_answer[1] == student_answer[2] && student_answer[1] > student_answer[0]) {
            return new int[]{2, 3};
        } else if (student_answer[0] == student_answer[2] && student_answer[0] > student_answer[1]) {
            return new int[]{1, 3};
        } else if (max == student_answer[0]) {
            return new int[]{1};
        } else if (max == student_answer[1]) {
            return new int[]{2};
        } else
            return new int[]{3};


    }

    public static void main(String[] args) {

        int print_ans[] = {};
        int[] input = {1, 3, 2, 4, 2};

        print_ans = solution(input);

        for (int i = 0; i < print_ans.length; i++) {
            System.out.print(print_ans[i] + " ");
        }
    }

}


/*public class Practice_Exam {

    public static int[] solution(int[] answers) {
        // 각 학생별 답안
        int[] student1 = new int[answers.length];
        int[] student2 = new int[answers.length];
        int[] student3 = new int[answers.length];

        // 각 학생별 답안 패턴
        int[] student1_pattern = {1, 2, 3, 4, 5};
        int[] student2_pattern = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3_pattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        //답안
        int[] answer = {};

        int student1_answer = 0, student2_answer = 0, student3_answer = 0;


        int index1 = 0, index2 = 0, index3 = 0;
        // 각 학생 답안 작성
        for (int i = 0; i < answers.length; i++) {
            // 학생1
            student1[i] = student1_pattern[index1];
            index1++;
            if (index1 == student1_pattern.length) {
                index1 = 0;
            }
            // 학생2
            student2[i] = student2_pattern[index2];
            index2++;
            if (index2 == student2_pattern.length) {
                index2 = 0;
            }
            //학생3
            student3[i] = student3_pattern[index3];
            index3++;
            if (index3 == student3_pattern.length) {
                index3 = 0;
            }
        }

        // 채점
        for (int i = 0; i < answers.length; i++) {
            if (student1[i] == answers[i]) {
                student1_answer++;
            }
            if (student2[i] == answers[i]) {
                student2_answer++;
            }
            if (student3[i] == answers[i]) {
                student3_answer++;
            }
        }


        // 1등 선정
        if (student1_answer > student2_answer && student1_answer > student3_answer) {
            answer = new int[1];
            answer[0] = 1;
        } else if (student2_answer > student1_answer && student2_answer > student3_answer) {
            answer = new int[1];
            answer[0] = 2;
        } else if (student3_answer > student1_answer && student3_answer > student2_answer) {
            answer = new int[1];
            answer[0] = 3;
        } else { // 동점자 발생
            if (student1_answer == student2_answer && student1_answer > student3_answer) {
                answer = new int[2];
                answer[0] = 1;
                answer[1] = 2;
            } else if (student2_answer == student3_answer && student2_answer > student1_answer) {
                answer = new int[2];
                answer[0] = 2;
                answer[1] = 3;
            } else if (student1_answer == student3_answer && student1_answer > student2_answer) {
                answer = new int[2];
                answer[0] = 1;
                answer[1] = 3;
            } else {
                answer = new int[3];
                answer[0] = 1;
                answer[1] = 2;
                answer[2] = 3;
            }
        }


        return answer;

    }

    public static void main(String[] args) {

        int print_ans[] = {};
        int[] input = {1, 3, 2, 4, 2};

        print_ans = solution(input);

        for (int i = 0; i < print_ans.length; i++) {
            System.out.print(print_ans[i] + " ");
        }
    }

}*/

/* <피드백>
 *  1. math.max 사용시 3개이상은 max( a, max(b,c)) 처럼 사용
 * 2. 패턴 배열 사용
 * */
