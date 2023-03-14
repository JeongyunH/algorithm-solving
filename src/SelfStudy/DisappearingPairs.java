import java.util.*;

// ACCAABBC --> AC
// ABCBBCBA --> ""
// BABABA --> BABABA
class Main {
	public String solution(String S){
		StringBuilder sb = new StringBuilder();
		char[] arr = S.toCharArray();

		for(int i=0 ; i<S.length() ; i++){
			int size = sb.length();
			if(size > 0 && sb.charAt(size-1) == arr[i]){
				sb.deleteCharAt((size-1));
			}
			else{
				sb.append(arr[i]);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		System.out.println(T.solution(str));
	}
}
