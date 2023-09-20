package PusrshothamAndMalli.PusrshothamAndMalli;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		System.out.println("Enter the a and b values: ");
		Scanner os = new Scanner(System.in);
		int a = os.nextInt();
		int b = os.nextInt();
		int c = a+b;
		System.out.println("Addition of a and b is: "+c);
	}
}