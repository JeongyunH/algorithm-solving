import java.util.*;

class Main {
public int[] solution(int n, int[] arr) {
	int idx = 0;
	for(int i=0 ; i<n-1 ; i++) {
		idx = i;
		for(int j=i+1 ; j<n ; j++) {
			if(arr[j] < arr[idx])	idx=j;
		}
		int temp = arr[i];
		arr[i] = arr[idx];
		arr[idx] = temp;
		System.out.println("#");
	}
	
	return arr;
}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
			arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr))
			System.out.print(x + " ");
	}
}
