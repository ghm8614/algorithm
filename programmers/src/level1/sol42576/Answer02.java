package level1.sol42576;

import java.util.HashMap;

public class Answer02 {

	//해시
	public String solution(String[] participant, String[] completion) {
		
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		
		for (String player : participant)
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		// hm : leo = 1, kiki = 1, eden = 1
		
		for (String player : completion)
			hm.put(player, hm.get(player) - 1);
		// hm : leo = 1, kiki = 0, eden = 0
		
		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;	// leo
			}
		}
		
		return answer;
	}
}
