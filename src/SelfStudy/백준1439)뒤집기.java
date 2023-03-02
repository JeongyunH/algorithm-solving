import java.util.*;

class Main {
	public int solution(String str) {
		int answer = 0;
		char[] a = str.toCharArray();
		for(int i=1 ; i<str.length() ; i++){
			if(a[i] != a[i-1])
				answer += 1;
		}

		answer = (answer+1)/2;
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
