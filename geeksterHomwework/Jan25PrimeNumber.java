package geeksterHomwework;

import java.util.Scanner;

public class Jan25PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in) ;
		int a=Sc.nextInt();
		int temp=0;
		for (int i=2;i<a;i++) {
		if(a%i==0) {
			temp=temp+1;

		}
		}
		if (temp>0) {
			System.out.print(a+"nonprime");
		}else {
			System.out.print(a+"prime");
		}
			
		
	}

}
