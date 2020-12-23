package basicCodes;
import java.util.Scanner;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int num1,num2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number:");
		num2=sc.nextInt();
		sc.close();
		sum = num1 + num2;
		System.out.println("Sum Of Two Numbers:"+sum);
		
		
	}

}
