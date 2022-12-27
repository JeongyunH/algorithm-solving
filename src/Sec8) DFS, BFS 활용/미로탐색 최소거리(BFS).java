import java.util.*;

class Point{
	public int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, dis;
	public void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x, y));
		board[x][y] = 1;
		while(!Q.isEmpty()) {
			Point cur = Q.poll();
			for(int j=0 ; j<4 ; j++) {
				int nx = cur.x+dx[j];
				int ny = cur.y+dy[j];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 &&
						board[nx][ny] == 0) {
					Q.offer(new Point(nx, ny));
					board[nx][ny] = 1;
					dis[nx][ny] = dis[cur.x][cur.y]+1;
				}
			}
		}
		System.out.print(dis[5][7]);
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		board = new int[8][8];
		dis = new int[8][8];
		for(int i=1 ; i<=7 ; i++) {
			for(int j=1 ; j<=7 ; j++)
				board[i][j] = kb.nextInt();
		}
		T.BFS(1, 1);
		if(dis[7][7] == 0) System.out.print(-1);
		else System.out.print(dis[7][7]);
	}
}
