import java.util.*;

class Main {
public String solution(String str1, String str2) {
	String answer = "YES";
	Queue<Character> Q = new LinkedList<>();
	for(char x : str1.toCharArray()) Q.offer(x);

	for(int i=0 ; i<str2.length() ; i++) {
		if(!Q.isEmpty() && str2.charAt(i) == Q.peek())	Q.poll();
	}
	if(Q.size() > 0)	return "NO";

	return answer;
}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str1 = kb.next();
		String str2 = kb.next();
		System.out.print(T.solution(str1, str2));
	}
}
