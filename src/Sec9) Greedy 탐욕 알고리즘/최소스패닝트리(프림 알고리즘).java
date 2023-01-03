import java.util.*;

class Edge implements Comparable<Edge>{
	public int vex, cost;
	public Edge(int vex, int cost){
		this.vex = vex;
		this.cost = cost;
	}
	@Override
 	public int compareTo(Edge o){
		return this.cost - o.cost;
	}
}
class Main {
        public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
		int m = kb.nextInt();
		ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
		for(int i=0 ; i<=n ; i++)
			graph.add(new ArrayList<>());
		int[] ch = new int[n+1];
		for(int i=0 ; i<m ; i++){
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge(b, c));
			graph.get(b).add(new Edge(a, c));
		}
		int answer = 0;
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(1, 0));
		while(!pQ.isEmpty()){
			Edge tmp = pQ.poll();
			int curV = tmp.vex;
			if(ch[curV]==0){
				ch[curV]=1;
				answer += tmp.cost;
				for(Edge ob : graph.get(curV)){
					if(ch[ob.vex]==0)	pQ.offer(new Edge(ob.vex, ob.cost));
				}
			}
		}
		System.out.println(answer);
    }
}
