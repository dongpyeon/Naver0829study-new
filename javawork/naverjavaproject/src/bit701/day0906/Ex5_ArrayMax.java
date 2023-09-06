package bit701.day0906;

public class Ex5_ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//최대값, 최소값 구하기
		int[] data;
		data= new int [] {5,-100,67,89,45,-9,123,58,110,200};
		System.out.println(data.length);
		int max, min;
		System.out.println();
		
		max = data[0];
		min = data[0];
		//최대값 구하기
		for(int n:data) {
			if(max<n) 
				max=n;
			if(min>n)
				min=n;
		}
		System.out.println("최대 :"+max);
		System.out.println("최소 :"+min);
	}

}
