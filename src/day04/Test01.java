package day04;

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		/*
		//���� 1.
		Scanner input = new Scanner(System.in);
		int repet;
		System.out.print("�� �Է� : ");
		repet = input.nextInt();
		for(int i = 0; i < repet; i++) {
			System.out.println(i+1+"�� �ݺ�");
		}
		
		//���� 2.
		for(int su=10; su>0; su--) {
			System.out.println("su : " + su);
		}
				
		//���� 3.
		int su, sum = 0;
		for(su = 1; su<=10; su+=2) {
			sum+=su;
		}
		System.out.println("sum : " + sum);
		
		//���� 4.
		int su, evenSum = 0, oddSum = 0;
		for(su = 1; su<=10; su++) {
			if(su % 2 == 0) {
				evenSum += su;
			}else{
				oddSum += su;
			}
		}
		System.out.println("1 ~ 10 ¦�� �� : " + evenSum);
		System.out.println("1 ~ 10 Ȧ�� �� : " + oddSum);
		
		//���� 5.
		int su = 1, sum = 0;
		for(; su <= 10;) {
			sum += su;
			su ++;
		}
		System.out.println("sum : " + sum);
		
		//���� 6.
		int su;
		for(su = 0; su < 4; su++) {
			System.out.println(su + 1 + ". hello");
		}
	
		//���� 7.
		int su, sum=0;
		for(su = 0; su <= 100; su++) {
			sum += su;
			if(sum<=528) {
				System.out.println(su);
			}
		}
		
		//���� 8.
		int su;
		for(su = 1; su<=25; su++) {
			if(su !=1 && su%5==1) {
				System.out.println("");
			}
			System.out.print(su+"\t");
		}
		
		
		
		//���� 9.
		int su1, su2, sum = 0;
		for(su1 = 1; su1 <= 10; su1++) {
			for(su2 = 1; su2 <= 10; su2++) {
				sum += 1;
			}
		}
		System.out.println("sum : " + sum);
		
		
		//���� 10.
		int su1, su2;
		for(su1 = 1; su1 <= 5; su1++) {
			for(su2 = 1; su2 <=5; su2++) {
				System.out.println("su1 : " + su1 + " su2 : " + su2);
			}
		}
		
		
		//���� 11.
		//ù���� 1���� �����ϰ�, ���������� ������ 2�辿 �����ϴ� ����̴�.
		//30��° �Ǵ� �� �����ؾ� �ϴ� �ݾ��� ���Ͻÿ�.
		int su;
		int money = 1;
		for(su=1; su<30; su++) {
			System.out.println(su + ": " + money);
			money *= 2;
		}
		System.out.println("30�Ͽ��� " + money + "�� ����");
		
		
		
		//���� 12.
		//1~1000������ ���� ���Ͻÿ�.
		//�� 3�� ����� �����ϰ� 3�� ����̸鼭 5�� ����� �������� �ʴ� �������� ���Ͻÿ�.
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
		System.out.println("���� : " + sum);
		
		*/
		//���� 13.
		//1���� �����Ͽ� Ȧ���� ���� ���ϸ鼭 �� ���� 10000�� ���� �ʴ� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
		      System.out.println("������ ���� "+v+ "�̰�, "+"�� ���� "+sum1+"�̴�.");
		  	}
		  
		/*
		//���� 14. 
		//������ �����
		int i;
		int j;
		for(i = 1; i<=9; i++) {
			for(j = 1; j<=9; j++) {
				System.out.println(i + " * " +  j + " = " + i*j);
			}
		}
		
		//���� 15.
		//2�� for���� �̿��Ͽ� �Ʒ��� ���� ����Ͻÿ�.
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
