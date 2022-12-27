import java.util.*;

class Main {
public String solution(int n, int[] arr) {
	String answer = "U";
	HashMap<Integer, Integer> map = new HashMap<>();
	for(int x : arr) {
		map.put(x, map.getOrDefault(x, 0)+1);
		if(map.get(x) > 1)
			return "D";
	}
	
	return answer;
}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
			arr[i] = kb.nextInt();
		System.out.print(T.solution(n, arr));
	}
}
