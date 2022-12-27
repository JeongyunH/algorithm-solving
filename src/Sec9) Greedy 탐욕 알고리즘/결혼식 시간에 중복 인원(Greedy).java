import java.util.*;

class Time implements Comparable<Time>{
	int t;
	char s;
	public Time(int t, char s) {
		this.t = t;
		this.s = s;
	}
	@Override
	public int compareTo(Time o) {
		if(this.t==o.t)	return this.s-o.s;
		return this.t-o.t;
	}
}
class Main {
	public int solution(ArrayList<Time> arr, int n) {
		int answer=0, cnt=0;
		Collections.sort(arr);	
		for(Time t : arr) {
			if(t.s == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0 ; i<n ; i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			arr.add(new Time(s, 's'));
			arr.add(new Time(e, 'e'));
		}
		System.out.print(T.solution(arr, n));
	}
}
