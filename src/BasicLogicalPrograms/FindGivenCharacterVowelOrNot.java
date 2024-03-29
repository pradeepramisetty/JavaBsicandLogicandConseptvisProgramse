package BasicLogicalPrograms;
import java.util.Scanner;
public class FindGivenCharacterVowelOrNot {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter A Charecter");
		char ch = scn.next().charAt(0);
		
		boolean isVowel = false;
		
		if(ch == 'a'||ch == 'A'|| 
				ch == 'e' || ch == 'E' ||
				ch == 'i' || ch == 'I' ||
				ch == 'o' || ch == 'O' ||
				ch == 'u' || ch == 'u'  ) {
			isVowel = true;
		}
		if(isVowel) {
			System.out.println("Given charecter is vowel");
		}else {
			System.out.println("Given charecter is  a consonent");
		}
		
	}
}
