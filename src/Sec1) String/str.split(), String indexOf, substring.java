import java.util.*;

class Main {
	public String solution(String str) {
		String answer = "";
		int max = Integer.MIN_VALUE, pos;
/*		String[] s = str.split(" ");
		for(String x : s){
			int len = x.length();
			if(len > max) {
				max = len;
				answer = x;
			}
		}*/
		while((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			if(tmp.length() > max) {
				max = tmp.length();
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		if(str.length() > max)	answer = str;
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}
