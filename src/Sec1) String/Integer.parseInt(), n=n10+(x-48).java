import java.util.*;

class Main {
	public int solution(String str) {
		int answer = 0;
		String strAnswer = "";
		for(char x : str.toCharArray()) {
//			if(x >= 48 && x <= 57)
//				answer = answer * 10 + (x - 48);
			if(Character.isDigit(x)) strAnswer+=x;
		}
		answer = Integer.parseInt(strAnswer);
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
