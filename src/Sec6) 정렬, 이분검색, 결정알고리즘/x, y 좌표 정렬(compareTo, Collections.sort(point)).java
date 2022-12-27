import java.util.*;

class Point implements Comparable<Point>{
	public int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		// 무조건 음수값으로 return 되게 해라
		// 오름차순 : this.y - o.y;
		// 내림차순 : o.y - this.y
		if(this.x == o.x) return this.y-o.y;
		else return this.x - o.x;
	}
}
class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for(int i=0 ; i<n ; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);
		for(Point o : arr)	System.out.println(o.x + " " + o.y);
	}
}
