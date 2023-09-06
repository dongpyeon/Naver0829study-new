package bit701.day0906;

public class Ex2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언 시 초기값을 지정하는 경우
		int[] arr1= {5,8,10,4,20};//5개로 배열이 자동 할당
		//할당 갯수 출력
		System.out.println("arr1의 할당 갯수 : "+arr1.length);
		System.out.println("** 출력 1 **");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("** 출력 2 **");
				
		for(int n:arr1) {
			System.out.println(n);
		}
		
		System.out.println("==".repeat(30));
		
		int []arr2;
		
		arr2=new int[] {3,6,8,10,30};
		for(int i=0;i<arr2.length;i++) {
			System.out.printf("[%2d:%2d]",i,arr2[i]);		
		}
		System.out.println("==".repeat(30));
		for(int n:arr2) {
			System.out.printf("%3d",n);
		}
		
	}

}
