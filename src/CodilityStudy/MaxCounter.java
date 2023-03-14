import java.util.*;


class Main {
	public int[] solution(int N, int[] A){
		int[] answer = new int[N];

		int max = 0;
		int fillmax = 0;

		for (int i : A) {
			if(i > N)	fillmax = max;
			else{
				answer[i-1] = Math.max(answer[i-1], fillmax) + 1;
				max = Math.max(max, answer[i-1]);
			}
		}

		for(int i=0 ; i<answer.length ; i++){
			answer[i] = Math.max(answer[i], fillmax);
 		}
		for(int i=0 ; i<answer.length ; i++)
			System.out.print(answer[i] + ", ");

		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[m];

		for(int i=0 ; i<m ; i++){
			arr[i] = kb.nextInt();
		}

		T.solution(n, arr);
	}
}
