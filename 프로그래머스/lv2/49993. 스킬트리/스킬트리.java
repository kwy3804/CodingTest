import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        List<Character> skillList = new ArrayList<>();
        for (char c : skill.toCharArray()) {
            skillList.add(c);
        }
        for (String tree : skill_trees) {
            List<Character> treeList = new ArrayList<>();
            for (char c : tree.toCharArray()) {
                if (skillList.contains(c)) {
                    treeList.add(c);
                }
            }
            boolean isPossible = true;
            for (int i = 0; i < treeList.size(); i++) {
                if (treeList.get(i) != skillList.get(i)) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) {
                answer++;
            }
        }
        return answer;
    }
}