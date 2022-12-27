import java.util.*;

class Brick implements Comparable<Brick>{
	public int w;
	public int h;
	public int g;
	Brick(int w, int h, int g){
		this.w = w;
		this.h = h;
		this.g = g;
	}
	@Override
	public int compareTo(Brick ob) {
		return ob.w - this.w;
	}
}
class Main {
	static int[] dy;
	public int solution(ArrayList<Brick> arr) {
		int answer = 0;
		Collections.sort(arr);
		dy[0] = arr.get(0).h;
		answer = dy[0];
		for(int i=1 ; i<arr.size() ; i++) {
			int max_h=0;
			for(int j=i-1 ; j>=0 ; j--) {
				if(arr.get(j).g>arr.get(i).g && dy[j]>max_h) {
					max_h=dy[j];
				}
			}
			dy[i] = max_h + arr.get(i).h;
			answer = Math.max(answer, dy[i]);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Brick> arr = new ArrayList<>();
		dy = new int[n];
		for(int i=0 ; i<n ; i++) {
			int w = kb.nextInt();
			int h = kb.nextInt();
			int g = kb.nextInt();
			arr.add(new Brick(w, h, g));			
		}
		System.out.println(T.solution(arr));
	}
}
