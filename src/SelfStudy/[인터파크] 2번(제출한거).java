import java.util.*;

class Main {
	public int[] solution(int N, int[] coffee_times){
		int[] answer = {};

		ArrayList<Integer> arr = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		int[][] machine = new int[2][N];
		// 0 : num, 1 : time

		int make = 0, done = 0;
		while(done < coffee_times.length){
			for(int i=0 ; i<N ; i++){
				if(machine[1][i] == 0 && make < coffee_times.length){
					machine[0][i] = make+1;
					machine[1][i] = coffee_times[make];
					if(min > machine[1][i])	min = machine[1][i];
					make++;
				}
			}
	
			for(int i=0 ; i<N ; i++){
				if(machine[0][i] != 0){
					machine[1][i] -= min;

					if(machine[1][i] == 0){
						arr.add(machine[0][i]);
						machine[0][i] = 0;
						done++;
					}
					else{
						min = Math.min(min, machine[1][i]);
					}	
				}	
			}	
		}

		answer = arr.stream().mapToInt(Integer::intValue).toArray();

        return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
        int[] arr = new int[m];
        for(int i=0 ; i<m ; i++)
            arr[i] = kb.nextInt();

		T.solution(n, arr);
//        System.out.println(T.solution(n, arr));
	}
}
