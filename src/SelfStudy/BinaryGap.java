import java.util.*;

class Main {
	public int solution(int N){
		int answer = 0;

		String binary = Integer.toBinaryString(N);

		char[] arr = binary.toCharArray();
		int lt=0;
		for(int rt = 1 ; rt < arr.length ; rt++){
			if(arr[rt] == '1'){
				answer = Math.max(answer, rt-lt-1);
				lt = rt;
			}
		}

        return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		T.solution(n);
	}
}
