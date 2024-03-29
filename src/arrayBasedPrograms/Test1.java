package arrayBasedPrograms;

public class Test1 {
	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,55,};
		int[] a2 = new int[5];
		a2[0] = 20;
		a2[1] = 20;
		a2[2] = 20;
		a2[3] = 20;
		a2[4] = 20;
		
		for(int i=0; i<a1.length; i++) {
			System.out.print(a1[i]+",");
		}
		
		for(int i=0; i<a2.length; i++) {
			System.out.println(a2[i]+",");
		}
		
		int[][] a3 = {{1,2,3,4},{23,455,7655,22,12},{5,6,7,4}};
		//System.out.println(a3);
		
		for(int i=0; i<a3.length;i++) {
			for(int j=0;j<a3.length;j++) {
				System.out.print(a3[i][j]+",");
			}
		}
	}
}
