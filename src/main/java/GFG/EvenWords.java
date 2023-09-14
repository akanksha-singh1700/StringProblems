
package GFG;

import java.util.Scanner;

class EvenWords {

	public static void main(String args[]) {
		System.out.println("Please enter a String");
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		sc.close();
		String[] words = ip.split(" ");
		for (String word : words) {
			if (word.length() % 2 == 0)
				System.out.println(word);
		}
	}

}
