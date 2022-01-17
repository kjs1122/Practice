import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		//Map 컬렉션 생성
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권",85);
		map.put("홍길동",90);
		map.put("동장군",80);
		map.put("홍길동",95);
		System.out.println("총 Entry 객체 숫자 : " + map.size());  //키 값 중복 안됨  값이 같을 경우 덮어 씌워짐

		System.out.println("\t홍길동 : " + map.get("홍길동")); // 키를 매개로 값 반환
		
		//객체를 하나씩 처리하기
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			int value = map.get(key);
			System.out.println("Key : " + key + " Value : " + value);
			
		};
		
		map.remove("홍길동");
		System.out.println("총 Entry 객체 숫자 : " + map.size());//객체 삭제 후 크기
		
		Set<Map.Entry<String, Integer>> mapEntry = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entry = mapEntry.iterator();
		while(entry.hasNext()) {
			Map.Entry<String, Integer> mEntry = entry.next();
			String key = mEntry.getKey();
			int value = mEntry.getValue();
			System.out.println("Key : " + key + " Value : " + value);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
