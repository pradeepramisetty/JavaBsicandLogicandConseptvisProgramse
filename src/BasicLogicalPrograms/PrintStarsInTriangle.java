package BasicLogicalPrograms;
import java.util.Scanner;
public class PrintStarsInTriangle {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter rows");
		int row = scn.nextInt();
		
		for(int i=0; i<=row; i++) {
			for(int j=0; j<=row-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
