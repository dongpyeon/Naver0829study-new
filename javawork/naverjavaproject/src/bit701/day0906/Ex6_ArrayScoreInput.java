package bit701.day0906;

import java.util.Scanner;

public class Ex6_ArrayScoreInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * score에 5개의 배열 할당 후 키보드로 직접 점수를 입력하여 배열에 저장후
		 * 총점과 평균을 구하세요
		 */
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5]; //5개 할당
		int sum = 0;
		double avg;
		
		System.out.println("점수를 5개 입력하세요");
		//방법 1
		for(int i=0; i<score.length; i++) {
			System.out.print(i+" 번째 점수 입력");
			score[i] = sc.nextInt();
			if(score[i]<1 || score[i]>100) {
				System.out.println("점수를 1~100 사이로 입력해주세요");
				i--;
				continue;
			}
			sum+=score[i];
		}
//		//방법 2
//		for(int n :score) {
//			n=sc.nextInt();
//			sum+=n;
//		}
		avg=(double)sum/score.length;//평균 구하기
		System.out.println("총점 :"+sum);
		System.out.println("평균 :"+avg);
		
		System.out.println("입력한 점수들");
		for(int n :score) {
			System.out.print(" "+n+" ");
		}
	}

}
