import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		//Map �÷��� ����
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("�ſ��",85);
		map.put("ȫ�浿",90);
		map.put("���屺",80);
		map.put("ȫ�浿",95);
		System.out.println("�� Entry ��ü ���� : " + map.size());  //Ű �� �ߺ� �ȵ�  ���� ���� ��� ���� ������

		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿")); // Ű�� �Ű��� �� ��ȯ
		
		//��ü�� �ϳ��� ó���ϱ�
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			int value = map.get(key);
			System.out.println("Key : " + key + " Value : " + value);
			
		};
		
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��ü ���� : " + map.size());//��ü ���� �� ũ��
		
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
