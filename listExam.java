package 중급;
import java.util.*;
public class listExam {
	static List<String> testList = new ArrayList<String>(); //중복허용됨. 순서개념o
	public static void testList() { //메소드로 활용
		
		
		testList.add("HELLO");
		testList.add("안녕하세요");
		
		Iterator<String> itr2 = testList.iterator();
		while(itr2.hasNext()) { //while문 hashNext,next 메소드 이용한 출력방법
			System.out.println(itr2.next());
		}  
		
		//for each
		for(String str :testList ) {
			System.out.println(str);
		}
		//for문 size,get 이용한 출력방법
		for (int i=0; i<testList.size();i++) {
			String value = testList.get(i);
					System.out.println(value);
		}
	}
		
	
	public List<String> addArray(String[]arr1, String[]arr2){
	        List<String> list = new ArrayList<String>();
	        
	        for(String str : arr1){
	        	list.add(str);
	        }
	        
	        for(String str : arr2){
	            list.add(str); 
	        }
	       	
	        
	        return list;
	    }
	    
	    public static void main(String[] args){
	    	listExam le = new listExam(); // 인터페이스기 때문에 반드시 인스턴스화 시켜야 한다.
	    	
	    	String[] arr1 = {"안","녕","하","세","요"};
	    	String[] arr2 = {"반","가","워","요"};
	    	
	    	Iterator<String> it = le.addArray(arr1, arr2).iterator();
	    	while(it.hasNext()) {
	    		System.out.println(it.next());
	    	} //hasNext, next 메소드 while 반복문을 이용한 출력방법
	    	
	    	
	  
	    	List<String> list = le.addArray(arr1, arr2); // 인스턴스화 된것을 list의 값에 넣어야 한다.
	      	System.out.println("list의 원소는" + list.size()+"개 입니다.");
	    	for (int i = 0;i<list.size();i++) {
	    		System.out.println("list의 "+(i+1)+"번 째 원소는"+ list.get(i)+"입니다.");
	    	}//size, get 을 이용한 출력
	   	 testList(); //testList 메소드 출력
		 
	    
	    }
	}


