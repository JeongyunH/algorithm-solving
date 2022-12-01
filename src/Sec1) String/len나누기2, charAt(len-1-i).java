import java.util.*;

class Main {
	public String solution(String str) {
		String answer = "YES";
/*		String tmp = new StringBuilder(str).reverse().toString();
		if(!str.equalsIgnoreCase(tmp))
			return "NO";*/
		
		str = str.toUpperCase();
		int len = str.length();
		for(int i=0 ; i<len/2 ; i++) {
			if(str.charAt(i) != str.charAt(len-1-i)) {
				return "NO";
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
