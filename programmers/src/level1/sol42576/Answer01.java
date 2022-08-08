package level1.sol42576;

import java.util.Arrays;

public class Answer01 {

	//배열
	public String solution(String[] participant, String[] completion) {
		
		Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i;
        
        for(i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        
        return participant[i];
    }
}
