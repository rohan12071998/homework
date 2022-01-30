package geeksterHomwework;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in) ;
		int num1=Sc.nextInt();
		int num2=Sc.nextInt();
	    int temp=0;
	    temp=num1;
	    num1=num2;
	    num2=temp;
		System.out.println(+num1);
		System.out.println(+num2);
		
		

	}

}
