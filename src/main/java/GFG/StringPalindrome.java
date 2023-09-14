package GFG;

import java.util.Scanner;

class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String ip = sc.nextLine();
		sc.close();
		if (isPalindrome(0, ip.length() - 1, ip))
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
	}
//recursive method
	public static boolean isPalindrome(int i, int j, String a) {
		if (i >= j)
			return true;
		if (a.charAt(i) != a.charAt(j))
			return false;

		return isPalindrome(i + 1, j - 1, a);
	}
}