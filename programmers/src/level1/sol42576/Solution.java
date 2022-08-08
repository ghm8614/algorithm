package level1.sol42576;

import java.util.Arrays;

public class Solution {

	public String solution(String[] participant, String[] completion) {
		
		Arrays.sort(participant);
        Arrays.sort(completion);
        
        int len = completion.length;
        
        for(int i = 0; i < len; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        
        return participant[len];
    }
	
	public static void main(String[] args) {
		String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        
        Solution sol = new Solution();
        System.out.println(sol.solution(part, comp));
	}
}
