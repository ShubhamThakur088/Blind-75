
public class ValidPalindrome {

	public static void main(String args[]) {
		System.out.print(isValidPalindrome("\"`l;`` 1o1 ??;l`\""));
		System.out.print(isValidPalindrome("A man, a plan, a canal: Panama"));
		System.out.print(isValidPalindrome("race a car"));
		System.out.print(isValidPalindrome(" "));
		System.out.print(isValidPalindrome("ab_a"));
		System.out.print(isValidPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
		System.out.print(isValidPalindrome("Was it\\ a rat I saw?"));		
	}
	
	public static boolean isValidPalindrome(String str) {
		String originalStr = new String(str.replaceAll("[!@#$%^&*{}\\\"\"?''\"<>+=():;_,.\\[\\]\\-\\\\` ]+", ""));
		char strToChar[] = str.replaceAll("[!@#$%^&*{}\\\"\"?''<>+=()\":;_,.\\[\\]\\-\\\\` ]+", "").toCharArray();
		String reversedStr = "";
		int len = strToChar.length-1;
		
		for(int i = len; i >= 0;i--) {
			reversedStr = reversedStr + strToChar[i];
		}
		
		System.out.println(reversedStr);
		
		if(originalStr.equalsIgnoreCase(reversedStr)) {
			return true;
		}else {
			return false;
		}
	}
}
