package BasicLogicalPrograms;
import java.util.Scanner;
public class PrintStarsinRectangularFormate {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		  System.out.println("Enter how many Rows");
		  int row = scn.nextInt();
		  System.out.println("Enter how many cols"); 
		  int cols = scn.nextInt();
		  
		  for(int i=0; i<row; i++) { 
			  for(int j=0; j<cols; j++) {
		      System.out.print("* ");
		      } 
		    System.out.println();
		  }
		 
		
	}
}
