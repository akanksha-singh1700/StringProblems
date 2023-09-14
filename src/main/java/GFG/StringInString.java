package GFG;

import java.util.Scanner;

class StringInString {

	public static void main(String args[]) {
		System.out.println("Please enter a String");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();

		System.out.println("Enter the string to inserted");
		String toBeInserted = sc.nextLine();

		System.out.println("Enter the index to insert the string");
		int index = sc.nextInt();
		sc.close();

		String updated = original.substring(0,index+1) + toBeInserted
				+ original.substring(index + 1);
		System.out.println(updated);
	}
}