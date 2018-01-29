package code.repo.array.medium;

public class KandaneAlgo {

		public static void main(String [] args){
			int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
			 int maxSum, maxGlobalSum;

		        maxSum = maxGlobalSum = arr[0];

		        for (int i = 1; i < arr.length; i++) {
		            maxSum = arr[i] > arr[i] + maxSum ? arr[i] : arr[i] + maxSum;
		            maxGlobalSum = maxSum > maxGlobalSum ? maxSum : maxGlobalSum;
		        }
			
			System.out.println("Max Sum: "+maxGlobalSum);
			
		}
}
