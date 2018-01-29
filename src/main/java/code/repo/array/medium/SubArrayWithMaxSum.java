package code.repo.array.medium;

public class SubArrayWithMaxSum {

	private int findMaxSum(int[] arr){
		int max = 0;
		int maxEnd = 0;
		
		for(int i = 0;i<arr.length;i++){
			maxEnd += arr[i];
			if(maxEnd<0) maxEnd = 0;
			if(maxEnd>max) max=maxEnd;
		}
		return max;
	}
	
	public int findMax(int[] arr){
		int max = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>max) max = arr[i];
		}
		return max;
	}
	
	public boolean checkIfAllNegative(int[] arr){
		boolean isPositive = true;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>0) isPositive = false;
		}
		return isPositive;
	}
	
	
	public static void main(String [] args){
		int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		int sum;
		
		SubArrayWithMaxSum s = new SubArrayWithMaxSum();
		if(s.checkIfAllNegative(arr)){
			sum = s.findMax(arr);
			System.out.println("array contains only negative values");
			System.out.println("sum: "+sum);
		}else{
			sum = s.findMaxSum(arr);
			System.out.println("sum: "+sum);
		}
		
	}
}
