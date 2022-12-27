import java.util.*;

class Main {
	static int n, answer;
	static ArrayList<ArrayList<Integer>> graph;
	public int BFS(int v) {
		int ch[] = new int[n+1];
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(1);
		ch[1] = 1;
		int L=0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0 ; i<len ; i++) {
				int nv = Q.poll();
				if(nv == v) return L;
				else {
					for(int x : graph.get(nv)) {
						if(ch[x] == 0) {
							Q.offer(x);	
							ch[x] = 1;
						}
					}
				}
			}
			L++;
		}
		return L;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int m = kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0 ; i<=n ; i++)
			graph.add(new ArrayList<Integer>());
		for(int i=0 ; i<m ; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		for(int i=2 ; i<n+1 ; i++) 
			System.out.println(i+" : "+ T.BFS(i));
	}
}
