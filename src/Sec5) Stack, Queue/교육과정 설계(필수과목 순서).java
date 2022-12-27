import java.util.*;

class Main {
public String solution(String need, String plan) {
	String answer = "YES";
	Queue<Character> Q = new LinkedList<>();
	for(char x : need.toCharArray()) Q.offer(x);
	for(char x : plan.toCharArray()) {
		if(Q.contains(x)) {
			if(x != Q.poll())	return "NO";
		}
	}
	if(!Q.isEmpty())	return "NO";

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
