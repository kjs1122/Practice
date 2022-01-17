import java.util.*;

public class TreeSetExample1 {

	public static void main(String args[]) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Iterator<Integer> descIterator =  scores.descendingIterator(); //내림차순으로 정렬된 Iterator반환
	
		NavigableSet<Integer> descendingSet = scores.descendingSet(); //내림차순으로 정렬된 NavigableSet반환
		for(Integer score : descendingSet) {
			System.out.println(score);
		}
		
		
	}
}
