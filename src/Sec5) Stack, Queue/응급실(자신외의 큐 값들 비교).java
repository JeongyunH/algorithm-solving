import java.util.*;

class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

class Main {
public int solution(int n, int m, int[] arr) {
	int answer = 0;
	Queue<Person> Q = new LinkedList<>();
	for(int i=0 ; i<n ; i++) {
		Q.offer(new Person(i, arr[i]));
	}
	while(!Q.isEmpty()) {
		Person tmp = Q.poll();
		for(Person x : Q) {
			// 아래를 만족하지 않으면 자신(tmp)이 priority가 가장 높은것(=진료받아도 됨)
			if(x.priority > tmp.priority) {
				Q.offer(tmp);
				tmp = null;
				break;
			}
		}
		if(tmp!=null) {
			answer++;
			if(tmp.id == m) return answer;
		}
	}
	return answer;
}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
			arr[i] = kb.nextInt();
		System.out.print(T.solution(n, m, arr));
	}
}
