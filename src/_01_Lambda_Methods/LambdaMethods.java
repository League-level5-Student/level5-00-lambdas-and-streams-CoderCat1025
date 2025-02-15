package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		//2. Call the printCustomMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) -> {
			StringBuilder build = new StringBuilder(s);
			build.reverse();
			System.out.println(build.toString());
		}, "backwards");
		//3. Call the printCustomMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			StringBuilder build = new StringBuilder("SILLY");
			for (int i = 0; i < s.length(); i++) {
				if (i%2==1) {
					build.setCharAt(i, s.charAt(i));
				}
			}

			System.out.println(build.toString());
		}, "silly");
		//4. Call the printCustomMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) -> {
			String a = "";
			for (int i = 0; i < s.length(); i++) {
				a=a+s.charAt(i)+".";
			}
			System.out.println(a);
		}, "periods");
		//5. Call the printCustomMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s) -> {
			StringBuilder build = new StringBuilder(s);
			for (int i = 0; i < build.length(); i++) {
				switch (build.charAt(i)) {
				case 'a':
					build.deleteCharAt(i);
					i--;
					break;
				case 'e':
					build.deleteCharAt(i);
					i--;
					break;
				case 'i':
					build.deleteCharAt(i);
					i--;
					break;
				case 'o':
					build.deleteCharAt(i);
					i--;
					break;
				case 'u':
					build.deleteCharAt(i);
					i--;
					break;

				}
			}
			System.out.println(build.toString());
		}, "no vowels");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}

