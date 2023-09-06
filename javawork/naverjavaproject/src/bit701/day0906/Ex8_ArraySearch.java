package bit701.day0906;

import java.util.Scanner;

public class Ex8_ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"강호동","유재석","한채영","이효리","이승기"};
		//이름을 검색하여 몇번째에 있는 지 출력
		//없을 경우 "xxx 님은 명단에 없습니다"
		Scanner sc = new Scanner(System.in);
		String searchName="";
		boolean bfind=false;
		
		//검색할 이름 입력
		System.out.println("검색할 이름을 입력하세요");
		searchName=sc.nextLine();
		//for문: 같은 이름이 있을 경우 출력, bfind도 true 변경 -break
		for(int i=0; i<names.length; i++) {
			if(names[i].equals(searchName)) {
				bfind=true;
				System.out.println(searchName+"은 "+(i+1)+"번째에 있습니다.");
				break;
			}
		}
		//bfind 값에 따라 못찾은 경우 메세지 출력
		if(!bfind) {
			System.out.println(searchName+"님은 명단에 없습니다");
		}
		
	}

}
