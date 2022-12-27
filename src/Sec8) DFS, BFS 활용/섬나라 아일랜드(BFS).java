import java.util.*;

class Point{
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Main {
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	static int[][] board;
	static int n, answer = 0;
	Queue<Point> Q = new LinkedList<>();
	public void BFS(int x, int y, int[][] board) {
		Q.offer(new Point(x, y));
		while(!Q.isEmpty()) {
			Point cur = Q.poll();
			for(int i=0 ; i<8 ; i++) {
				int nx = cur.x+dx[i];
				int ny = cur.y+dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<n &&
						board[nx][ny] == 1) {
					board[nx][ny] = 0;
					Q.offer(new Point(nx, ny));
				}
			}			
		}
	}
	public void solution(int[][] board) {
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				if(board[i][j] == 1) {
					board[i][j] = 0;
					BFS(i, j, board);
					answer++;
				}
			}
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		T.solution(arr);
		System.out.print(answer);
	}
}
