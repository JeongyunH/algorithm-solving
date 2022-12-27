import java.util.*;

class Main {
	static int n;
	static int[] ch;
	public void DFS(int L) {
		if(L == n+1) {
			String tmp = "";
			for(int i=1 ; i<=n ; i++) {
				if(ch[i] == 1) tmp+=(i+" ");
			}
			if(tmp.length()>0) System.out.println(tmp);
		}
		else {
			ch[L] = 1;	// 사용한다. O
			DFS(L+1);	// 왼쪽 순회
			ch[L] = 0;	// 사용하지 않는다. X
			DFS(L+1);	// 오른쪽 순회
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ch = new int[n+1];
		T.DFS(1);
	}
}
