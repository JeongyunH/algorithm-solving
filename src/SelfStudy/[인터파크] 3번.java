import java.util.*;

class Main {
	public int solution(String s){
		int answer = 1;

		char[] arr = s.toCharArray();

		for(int rt=s.length() ; rt>1 ; rt--){
			for(int lt=0; lt+rt<=s.length() ; lt++){
				if(isPalin(arr, lt, lt+rt))
					return rt;
			}
		}

		return answer;
	}
	public boolean isPalin(char[] arr, int start, int end){
		int len = end - start;
		for(int i=0 ; i<len/2 ; i++){
			if(arr[i+start] != arr[end-1-i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

        System.out.println(T.solution(str));
	}
}
