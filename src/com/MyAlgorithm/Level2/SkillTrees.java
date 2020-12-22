package com.MyAlgorithm.Level2;

/* <문제 정의 : https://programmers.co.kr/learn/courses/30/lessons/49993>
 * 2020.12.14.
 * String skill : 선행 스킬 순서, 1이상 26이하, 중복X
 * String[] skill_trees : 유저들이 만든 스킬트리, 1이상 20이하, 원소의 길이는 2이상 26이하
 * return : 가능한 스킬 트리의 개수
 * 스킬은 알파벳 대문자로 표기
 *
 * feedback : 선행스킬이 필요없는 스킬로만 구성되어있어도 가능한 부분 생각했어야 함
 **/


public class SkillTrees {

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {

            int index = skill_trees[i].length() + 1;
            boolean fst = true;

            for (int j = skill.length() - 1; j > -1; j--) {

                if (!skill_trees[i].contains(String.valueOf(skill.charAt(j)))) {
                    if (!fst) {
                        break;
                    } else {
                        if (j == 0) { // 선행스킬이 필요없는 스킬로만 구성되어있어도 answer++
                            answer++;

                            break;
                        }
                        continue;
                    }
                } else if (index < skill_trees[i].indexOf(skill.charAt(j))) {
                    break;
                } else {
                    index = skill_trees[i].indexOf(skill.charAt(j));
                    fst = false;

                    if (j == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        System.out.println(solution(skill, skill_trees));
    }
}