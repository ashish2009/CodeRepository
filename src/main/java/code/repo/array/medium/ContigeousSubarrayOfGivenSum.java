package code.repo.array.medium;

public class ContigeousSubarrayOfGivenSum {
	
	static int subArraySum(int arr[], int n, int sum) 
    {
        int curr_sum = arr[0], start = 0, i;
 
        // Pick a starting point
        for (i = 1; i <= n; i++) 
        {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i-1)
            {
                curr_sum = curr_sum - arr[start];
                start++;
            }
             
            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum) 
            {
                int p = i-1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                return 1;
            }
             
            // Add this element to curr_sum
            if (i < n)
            curr_sum = curr_sum + arr[i];
             
        }
 
        System.out.println("No subarray found");
        return 0;
    }
	
	public static void contineousSubarray(int[] a,int n){
		
		int sum = 0; int i = 0;int j = 0;
		
		while(i<a.length && j<a.length){
			if(sum<n && i<a.length){
				sum += a[i];
				i++;
			}
			
			if(sum>n && j<a.length){
				sum = 0;
				j++;
				i=j;
			}
			
			if(sum==n){
				System.out.println("contineous subarray with given sum: "+"("+j+","+i+")");
				break;
			}
			
			
		}
	}
	
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		subArraySum(arr, 5,9);
		contineousSubarray(arr,9);
	}

}
