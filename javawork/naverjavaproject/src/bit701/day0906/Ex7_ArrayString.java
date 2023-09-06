package bit701.day0906;

import java.util.Scanner;

public class Ex7_ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] names;
		int count;
		
		System.out.println("몇명을 입력하시겠습니까");
		count=Integer.parseInt(sc.nextLine());
		//
		names = new String[count];
		
		for(int i=0; i<names.length; i++) {
			System.out.println(i+"번째 이름을 입력하세요");
			names[i] = sc.nextLine();
		}
		//출력
		System.out.println("");
		for(int i=0; i<names.length; i++) {
			System.out.println(i+1+"번 \t"+names[i]);
		}
		
	}

}
