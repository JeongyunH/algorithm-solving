import java.util.*;

class Main {
	public String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray();
		int cnt=1;
		for(int i=0 ; i<str.length() ; i++) {
//			if(str.charAt(i) == str.charAt(i+1)) {
			if(i!=str.length()-1 && s[i] == s[i+1]) {
				cnt++;
			}
			else {
//				answer += str.charAt(i);
				answer += s[i];
				if(cnt > 1)	answer += String.valueOf(cnt);
				cnt=1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		System.out.print(T.solution(str));
	}
}
