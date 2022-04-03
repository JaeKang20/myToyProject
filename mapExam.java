package 중급;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class mapExam {
	
	public	Map<String, Integer> makeMap(){ //void 할 수 없음. map값이 리턴값임
		Map<String, Integer> products = new HashMap<String, Integer>();
		products.put(null, null);
		return products;
		}

	public static void main(String[] args) {
		// key는 중복될 수 없고 자료는 중복될 수 있다.

		Map<String, Integer> makeMap = new HashMap<String, Integer>();	
		
		makeMap.put("가위", 2500);
		makeMap.put("크레파스", 5000);
		Set<String> keys = makeMap.keySet();
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = makeMap.get(key);
			System.out.println(key+": "+ value);
		}
		
//		System.out.println(makeMap.size());
		
//		Map<String, String> map = new HashMap<>();
//		map.put("001", "kim");
//		map.put("002", "moon");
//		map.put("003", "choi");
//		
//		map.put("001", "kang"); //key 값은 동일 //기존값 바꿈
//		
//		System.out.println(map.size());
//		System.out.println(map.get("001"));//key값을 주면 된다.
//		
//		Set<String>keys = map.keySet(); // 모든 값을 볼 수 있는 Set값으로 key, value 값을 지정.
//		Iterator<String> iter = keys.iterator();
//		while (iter.hasNext()) {
//			String key = iter.next();
//			String value = map.get(key);
//			System.out.println(key +": "+ value);
//		} 
		
		
	}

}
