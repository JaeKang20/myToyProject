package 중급;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {
	
	 public static void main(String[] args){
		 Set<String> set = new HashSet<String>();//중복이 허용되지 않음, 순서개념x
		 set.add("a");
		 set.add("a");
		 set.add("b");
		 System.out.println("set의 내용 출력");
		 
		 Iterator<String> iter = set.iterator();
		 while (iter.hasNext()) {
			 String str = iter.next();
			 System.out.println(str);
		 }
		 
	 }
}