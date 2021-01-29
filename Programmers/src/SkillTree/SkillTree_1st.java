package SkillTree;

public class SkillTree_1st {

	public static void main(String[] args) {
//		String skill = "CBD";
//		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
//		String skill = "CBD";
//		String[] skill_trees = {"CAD"};
		
		String skill = "CBDK";
		String[] skill_trees = {"CB", "CXYB", "BD", "AECD", "ABC", "AEX", "CDB", "CBKD", "IJCB", "LMDK"};
		
		int answer = 0;


		String reg = "[^";
				reg = reg.concat(skill).concat("]"); // [^CBDK]
		
		for(int i = 0; i < skill_trees.length; i++) {
			skill_trees[i] = skill_trees[i].replaceAll(reg, ""); //skill에 해당하는 문자만 빼고 전부 없애기
			System.out.println(skill_trees[i]);
			
			
			if(skill_trees[i].length() == 0) { // 스킬트리와 일치하는 스킬이 없는 경우
				answer++;
				continue; // 어차피 길이가 0이기 때문에 뒤쪽 for문을 실행할 필요가 없음.
			}
			
			for(int j = skill.length()-1; j >= 0; j--) { // skill 뒤쪽 인덱스부터 앞으로 이동
				if(skill_trees[i].contains(String.valueOf(skill.charAt(j)))) { // 스킬트리가 for문에 해당하는 스킬을 포함하는 경우
					
					if(skill_trees[i].contains(skill.substring(0, j+1))) answer++; // for문에 해당하는 스킬까지 substring 해서 통째로 포함하는지 확인
					break; // 맨 뒤부터 검사하기 때문에 위의 if문을 확인하고 나면 바로 탈출해야한다.
				}
			}	
		}
		
		System.out.println(answer);

	}
}

/*





 */
