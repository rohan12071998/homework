package geeksterHomwework;

import java.util.Scanner;

public class factorialOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in) ;
		int n=Sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.print(fact);

	}

}
