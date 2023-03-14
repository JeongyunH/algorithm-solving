import java.util.*;


class Main {
	public int solution(int[] A){
		int answer = 0;

		Arrays.sort(A);

		if(A[0] >= 2)	return 1;
		if(A[A.length] < 0) return 1;

		for(int i=1 ; i<A.length ; i++){
			if(A[i-1]+1 < A[i])
				answer = A[i-1]+1;
		}
		if(answer < 0)	answer = 1;
		if(answer == 0) answer = A.length+1;

		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
//		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[m];

		for(int i=0 ; i<m ; i++){
			arr[i] = kb.nextInt();
		}

		System.out.println(T.solution(arr));
	}
}
