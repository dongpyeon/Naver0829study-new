package bit701.day0906;

import java.util.Scanner;

public class Ex12_ArraySearchName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String []names= {"강호동","유재석","한채영","이효리","이승기"
				,"강남길","이민정","이서진","손미나","유미리"};
		
		/*
		 * 검색할 성은 ? 이
		 * 4:이효리
		 * 5:이승기
		 * 7:이민정
		 * 8:이서진
		 * 총4명
		 * 
		 * 검색할 성은?  박
		 *  
		 *  "박" 씨 성을 가진 멤버는 없습니다
		 *  
		 *  검색할 성은 ? 끝
		 *  	종료합니다
		 *  
		 *  	변수 : String searchSung
		 *  			int count;
		 *  			boolean bFind;
		 *  
		 *  		startsWith 사용
		 *  
		 */
		
		String searchSung;
		
		while(true) {
			boolean bFind=false;
			int count = 0;
			System.out.println("검색할 성은?");
			searchSung = sc.nextLine();
			
			//끝일 경우 종료
			if(searchSung.equals("끝")) {
				System.out.println("*** 종료합니당 ㅋㅋ ****");
				break;
			}
			//검색 시작
			for(int i=0;i<names.length;i++) {
				if(names[i].startsWith(searchSung)) {
					bFind=true;
					System.out.println(i+":"+names[i]);
					count++;
				}
				
			}
			if(bFind==false)
				System.out.println(searchSung+"씨 성을 가진 사람은 없습니다.\n");
			else {
				System.out.println("총"+count+"명\n");
			}


		}


	}

}
