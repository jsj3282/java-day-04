package day04;

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		/*
		//예제 1.
		Scanner input = new Scanner(System.in);
		int repet;
		System.out.print("수 입력 : ");
		repet = input.nextInt();
		for(int i = 0; i < repet; i++) {
			System.out.println(i+1+"번 반복");
		}
		
		//예제 2.
		for(int su=10; su>0; su--) {
			System.out.println("su : " + su);
		}
				
		//예제 3.
		int su, sum = 0;
		for(su = 1; su<=10; su+=2) {
			sum+=su;
		}
		System.out.println("sum : " + sum);
		
		//예제 4.
		int su, evenSum = 0, oddSum = 0;
		for(su = 1; su<=10; su++) {
			if(su % 2 == 0) {
				evenSum += su;
			}else{
				oddSum += su;
			}
		}
		System.out.println("1 ~ 10 짝수 합 : " + evenSum);
		System.out.println("1 ~ 10 홀수 합 : " + oddSum);
		
		//예제 5.
		int su = 1, sum = 0;
		for(; su <= 10;) {
			sum += su;
			su ++;
		}
		System.out.println("sum : " + sum);
		
		//예제 6.
		int su;
		for(su = 0; su < 4; su++) {
			System.out.println(su + 1 + ". hello");
		}
	
		//예제 7.
		int su, sum=0;
		for(su = 0; su <= 100; su++) {
			sum += su;
			if(sum<=528) {
				System.out.println(su);
			}
		}
		
		//예제 8.
		int su;
		for(su = 1; su<=25; su++) {
			if(su !=1 && su%5==1) {
				System.out.println("");
			}
			System.out.print(su+"\t");
		}
		
		
		
		//예제 9.
		int su1, su2, sum = 0;
		for(su1 = 1; su1 <= 10; su1++) {
			for(su2 = 1; su2 <= 10; su2++) {
				sum += 1;
			}
		}
		System.out.println("sum : " + sum);
		
		
		//예제 10.
		int su1, su2;
		for(su1 = 1; su1 <= 5; su1++) {
			for(su2 = 1; su2 <=5; su2++) {
				System.out.println("su1 : " + su1 + " su2 : " + su2);
			}
		}
		
		
		//예제 11.
		//첫날에 1원을 예금하고, 다음날에는 전날의 2배씩 증가하는 방식이다.
		//30일째 되는 날 예금해야 하는 금액을 구하시오.
		int su;
		int money = 1;
		for(su=1; su<30; su++) {
			System.out.println(su + ": " + money);
			money *= 2;
		}
		System.out.println("30일에는 " + money + "원 예금");
		
		
		
		//예제 12.
		//1~1000까지의 합을 구하시오.
		//단 3의 배수는 제외하고 3의 배수이면서 5의 배수는 제외하지 않는 조건으로 구하시오.
		int su;
		int sum=0;
		for(su=1; su<=1000; su++) {
			if(su % 3 == 0) {
				if(su % 5 == 0) {
					sum += su;
				}
			}else {
				sum += su;
			}
			System.out.println(su + " : " + sum);
		}
		System.out.println("합은 : " + sum);
		
		*/
		//예제 13.
		//1부터 시작하여 홀수의 합을 구하면서 그 합이 10000을 넘지 않는 마지막 수를 구하는 프로그램을 작성하시오.
		int su; 
		int sum = 0;
		for(su = 1; ; su+=2) {
			sum += su;
			System.out.println(su + " : " + sum);
			if(sum>10000) break;
		}
		System.out.println(su-2);
		
		  int v, sum1=0;
		  for(v=0; sum1<10000;++v) {
		      if(v%2==1) {
		    	  sum1 += v;
		      	} 
		      System.out.println("마지막 수는 "+v+ "이고, "+"총 합은 "+sum1+"이다.");
		  	}
		  
		/*
		//예제 14. 
		//구구단 만들기
		int i;
		int j;
		for(i = 1; i<=9; i++) {
			for(j = 1; j<=9; j++) {
				System.out.println(i + " * " +  j + " = " + i*j);
			}
		}
		
		//예제 15.
		//2중 for문을 이용하여 아래와 같이 출력하시오.
		int i, j;
		for(i=0; i<25; i+=5) {
			for(j=1; j<6; j++) {
				System.out.print(j + i+ "\t");
			}
			System.out.println();
		}
		*/
	}
}
