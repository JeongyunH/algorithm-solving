import java.util.*;

class Main {
public int solution(int n, int k, int[] arr) {
	int answer = 0, sum = 0, lt=0;
	int zeroCnt = 0;
	
	for(int rt=0 ; rt<n ; rt++) {
		sum += arr[rt];
		if(arr[rt] == 0)	zeroCnt++;
		while(zeroCnt > k) {
			if(arr[lt] == 0)	zeroCnt--;
			sum -= arr[lt++];
		}
		answer = Math.max(answer, sum);
	}
		
	return answer+k;
}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.print(T.solution(n, k, arr));
	}
}
