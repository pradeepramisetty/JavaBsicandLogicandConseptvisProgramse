package arrayBasedPrograms;

public class SortElementWithoutPredifindMethod {
	
	public static void main(String[] args) {
		
		int[] arr = {6,7,90,24,56,346,87,1,3,2,5,10,23,45,1,65,67};
		System.out.println("before sorting the elements are");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp   =  arr[i];
					arr[i] =  arr[j];
					arr[j] =  temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
