package bit701.day0906;

public class Ex16_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	6개 할당된 lotto 변수에 1~45 사이의 난수를 발생하는데
		 * 	중복된 경우 다시 발생) 오름차순 정렬로 출력하시오
		 */
		int[]num =new int[6];
		Loop:
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45+1); 

			//중복처리 -같은숫자가 있을경우 다시 발생
			for(int j=0;j<i;j++) {
				if(num[i]==num[j]) {
					i--;
					continue Loop;
				}
			}
		}
		
		for(int i=0; i<num.length-1; i++) {
			for(int j=i+1; j<num.length;j++) {
				if(num[i]>num[j]) { //오름차순
//				if(num[i]<num[j]) { //내림차순
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		//출력 (한줄에 5개씩 출력)
		for(int i=0; i<num.length; i++) {
			System.out.printf("%4d",num[i]);
		}

	}

}
