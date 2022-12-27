import java.util.*;

class Main {
public int solution(String s, String t) {
	int answer = 0;
	HashMap<Character, Integer> tmap = new HashMap<>();
	HashMap<Character, Integer> smap = new HashMap<>();
	for(char c : t.toCharArray())
		tmap.put(c, tmap.getOrDefault(c, 0)+1);
	
	for(int i=0 ; i<t.length()-1 ; i++)
		smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0)+1);
	int lt=0;
	for(int rt=t.length()-1 ; rt<s.length() ; rt++) {
		smap.put(s.charAt(rt), smap.getOrDefault(s.charAt(rt), 0)+1);
		if(tmap.equals(smap)) answer++;
		smap.put(s.charAt(lt), smap.get(s.charAt(lt))-1);
		if(smap.get(s.charAt(lt)) == 0) smap.remove(s.charAt(lt));
		lt++;
	}
	
	return answer;
}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String t = kb.next();
		
		System.out.print(T.solution(s, t));
	}
}
