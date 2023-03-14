import java.util.*;

class Main {
	public int solution(int[] arr){
		int answer = Integer.MAX_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], i);
            }
            else{
                int find = map.get(arr[i]);
                int len = i - find;
                answer = Math.min(answer, len);
                map.remove(find);
                map.put(arr[i], i);
            }
        }

		if(answer == Integer.MAX_VALUE)	answer = -1;

        return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i] = kb.nextInt();

        System.out.println(T.solution(arr));
	}
}
