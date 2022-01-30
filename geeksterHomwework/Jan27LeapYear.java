package geeksterHomwework;

import java.util.Scanner;

public class Jan27LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in) ;
		int a=Sc.nextInt();
		if(a%400==0) {
			System.out.println(a+"leap year");
		}else if(a%100==0) {
			System.out.println(a+" nonleap year");
		}else if(a%4==0) {
			System.out.println(a+"leap year");
		}else {
			System.out.println(a+"nonleap year");
		}

	}

}
