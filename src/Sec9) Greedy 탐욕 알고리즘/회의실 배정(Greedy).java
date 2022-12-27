import java.util.*;

class Time implements Comparable<Time>{
	int s, e;
	public Time(int s, int e) {
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Time o) {
		if(this.e == o.e) return this.s-o.s;
		else return this.e-o.e;
	}
}
class Main {
	public int solution(ArrayList<Time> arr, int n) {
		int cnt=0;
		Collections.sort(arr);
		int end = 0;
		for(Time t : arr) {
			if(t.s >= end) {
				cnt++;
				end = t.e;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0 ; i<n ; i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			arr.add(new Time(s, e));
		}
		System.out.print(T.solution(arr, n));
	}
}
