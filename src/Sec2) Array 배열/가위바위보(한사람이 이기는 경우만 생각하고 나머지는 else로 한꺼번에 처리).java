import java.util.*;

class Main {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for(int i=0 ; i<n ; i++) {
			if(arr1[i] == arr2[i])
				answer[i] = "D";
			else if(arr1[i] == 1 && arr2[i] == 3) {
				answer[i] = "A";
			}
			else if(arr1[i] == 2 && arr2[i] == 1) {
				answer[i] = "A";
			}
			else if(arr1[i] == 3 && arr2[i] == 2) {
				answer[i] = "A";
			}
			else
				answer[i] = "B";
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			arr1[i] = kb.nextInt();
		}
		for(int i=0 ; i<n ; i++) {
			arr2[i] = kb.nextInt();
		}

		for(String x : T.solution(n, arr1, arr2))
			System.out.println(x);
	}
}
