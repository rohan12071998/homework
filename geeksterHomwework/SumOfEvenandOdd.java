package geeksterHomwework;

import java.util.Scanner;

public class SumOfEvenandOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in) ;
		int n=Sc.nextInt();
		int sumE=0,sumO=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sumE=sumE+i;
			}else {
				sumO=sumO+i;
			}
		
			
		}
		System.out.println(sumE);
		System.out.print(sumO);
				
				
		

	}

}
