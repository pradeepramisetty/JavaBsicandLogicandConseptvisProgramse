package BasicLogicalPrograms;
import java.util.Scanner;
public class PrintStarsInDiamondFrmt {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter rows (only (odd number)");
		int row = scn.nextInt();
		if(row % 2 == 0) {
			System.out.println("Please Enter Only Odd number ");
			return;
		}
		for(int i=1; i<=row; i+=2) {
			for(int j=0;j<=(row-i)/2; j++) {
				System.out.print(" ");
			}
			for(int k=1; i<=row; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
