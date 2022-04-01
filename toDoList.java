package 중급;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class toDoList {
	private static List<String> currentList =new ArrayList<String>();// ArrayList string값 사용
public static void main(String[]args) {
	int menuItem =-1;
	// 인덱스 때문에 -1 해준듯? 
	while (menuItem !=0) { //0이 아닌것이 참
		menuItem = menu(); // menu 메소드 실행 menu는 item을 선택
		//메뉴 클래스에서 0~3 까지 입력받는것을 통해 menuItem 클래스 작동하게 함

		switch(menuItem) {
		case 1:
			showList();
			break;
		case 2:
			addItem();
			break;
		case 3:
			removeItem();
			break;
			
		case 0:
			break;
			
		default:
			System.out.println("Enter a valid option");
		}
		
	}
}

		public static int menu() {
		
			System.out.println("--------------------");
			System.out.println("Main Menu");
			System.out.println("--------------------");
			System.out.println("0. Exit the program");
			System.out.println("1. Display to-do list");
			System.out.println("2. Add item to list");
			System.out.println("3. Remove item from list");
			System.out.println("--------------------");
			System.out.println("Enter choice: ");
		
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if(choice >4) {
				System.out.println("잘못된 번호입니다. 다시 입력하세요");
			}
			return choice; //초이스를 입력받아 리턴
			
		}
		
		public static void showList() { //내가 갖고 있는 리스트를 출력
			System.out.println();
			System.out.println("--------------------");
			System.out.println("To-Do List");
			System.out.println("⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️");
			int number = 0;
			
			for (String item :currentList ) { //입력받고 싶은 값 currentList 
				//출력하고 싶은값 item
				System.out.println(++number +  ". " + item); //넘버는 무조건 1부터 시작!
			}
			System.out.println("⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️");
		}
		
		
		public static void addItem() {
			System.out.println("Add Item");
			System.out.println("--------------------");
			System.out.println("Enter an item: ");
			Scanner sc = new Scanner(System.in);
			String item = sc.nextLine(); // item 입력을 받아서 showList 에 넣어주기!
			currentList.add(item); //ArrayList insert 활용!
			showList();		
		}
		
		public static void removeItem() {
			System.out.println("Remove Item");
			System.out.println("--------------------");
			Scanner sc = new Scanner(System.in);
			System.out.println("What do you want to remove?");
			int indexInput = sc.nextInt();
			if((indexInput - 1)<0||indexInput>currentList.size()) { // or 연산자 크거나 작을 수 없
				System.out.println("Wrong index nember! Please enter in range of 1 to " +currentList.size());
					
			}else {
				currentList.remove(indexInput-1); //넘버때문에 원소값을 -1해주어야함
			}
			System.out.println("--------------------");
			showList();
		}
}









