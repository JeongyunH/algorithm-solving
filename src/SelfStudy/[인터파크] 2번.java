import java.util.*;

class Coffee implements Comparable<Coffee>{
	int num;
	int times;
	Coffee(int n, int t){
		this.num = n;
		this.times = t;
	}
	@Override
	public int compareTo(Coffee o){
		if(this.times==o.times)
			return this.num - o.num;
		else
			return this.times - o.times;
	}
}
class Main {
	public int[] solution(int N, int[] coffee_times){
		int[] answer = {};

		int checkNum = 0;
		int min = Integer.MAX_VALUE;
		ArrayList<Coffee> arr = new ArrayList<>();
		ArrayList<Integer> arrAnswer = new ArrayList<>();

		while(checkNum < coffee_times.length){
			while(arr.size() < N){
				arr.add(new Coffee(checkNum+1, coffee_times[checkNum]));
				checkNum++;
			}
			Collections.sort(arr);

			Coffee now = arr.get(0);
			min = now.times;

			for(int i=0 ; i<arr.size() ;){
				arr.get(i).times -= min;
				if(arr.get(i).times == 0){
					arrAnswer.add(arr.get(i).num);
					arr.remove(i);
				}
				else
					i++;	
			}
		}

		Collections.sort(arr);
		for(int i=0 ; i<arr.size() ; i++){
			arrAnswer.add(arr.get(i).num);
		}

		answer = arrAnswer.stream().mapToInt(Integer::intValue).toArray();

		for (int a : answer) {
			System.out.print(a+", "); 
		}
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
	}
}
