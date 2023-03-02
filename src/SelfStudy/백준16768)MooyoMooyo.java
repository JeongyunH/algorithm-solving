import java.util.*;

class Main {
	static int n, m, num;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int arr[][];
	static int checkArr[][];
	static int checkArr2[][];
	public void DFS(int x, int y){
		checkArr[x][y] = 1;
		for(int i=0 ; i<4 ; i++){
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < n && ny >= 0 && ny < 10){
				if(checkArr[nx][ny] == 0 && arr[x][y] == arr[nx][ny]){
					num++;
					DFS(nx, ny);
				}
			}
		}
	}
	public void DFS2(int x, int y){
		checkArr2[x][y] = 1;
		for(int i=0 ; i<4 ; i++){
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < n && ny >= 0 && ny < 10){
				if(checkArr2[nx][ny] == 0 && arr[x][y] == arr[nx][ny]){
					DFS2(nx, ny);
				}
			}
		}
		arr[x][y] = 0;
	}
	public void Down(int x, int y){
		int[] tmp = new int[n];
		for(int i=0 ; i<10 ; i++){
			int cnt = 0;
			for(int j=0 ; j<n ; j++){
				if(arr[j][i] != 0){
					tmp[cnt] = arr[j][i];
					cnt++;
				}
			}
			for(int j=0 ; j<n-cnt ; j++){
				arr[j][i] = 0;
			}
			for(int j=n-cnt, k=0 ; j<n ; j++, k++){
				arr[j][i] = tmp[k];
			}
		}
	}
	public void print(int[][] arr){
		System.out.println("-----------------------");
		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<10 ; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------------------");
	}
	public void init(){
		for(int a[] : checkArr){
			Arrays.fill(a, 0);
		}
		for(int a[] : checkArr2){
			Arrays.fill(a, 0);
		}	
	}
	public void solution(int[][] arr) {
		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<10 ; j++){
				num = 0;
				if(arr[i][j] == 0 || checkArr[i][j] == 1)
					continue;
				num = 1;
				DFS(i, j);
				if(num >= m){
					DFS2(i, j);
//					print(arr);
					Down(i, j);
//					print(arr);
				}
				init();
			}
		}
		print(arr);
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n][10];
		checkArr = new int[n][10];
		checkArr2 = new int[n][10];
		for(int i=0 ; i<n ; i++){
			String str = kb.next();
			for(int j=0 ; j<10 ; j++){
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		T.solution(arr);
//		System.out.println(T.solution(arr));
	}
}
