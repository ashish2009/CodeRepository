package code.repo.array.medium;

import java.util.HashSet;

public class AbsoluteDifference {

	static void pairsWithDiff(int[] arr,int k){
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				
					if(Math.abs(arr[i]-arr[j])==k){
						System.out.println(arr[i]+" and "+arr[j] +" has difference "+k);
					}
				}
			}
		}
	
	static boolean isPairPresent(int arr[],int n)
    {
        int size = arr.length;
 
        // Initialize positions of two elements
        int i = 0, j = 1;
 
        // Search for a pair
        while (i < size && j < size)
        {
            if (i != j && arr[j]-arr[i] == n)
            {
                System.out.print("Pair Found: "+
                                 "( "+arr[i]+", "+ arr[j]+" )");
                return true;
            }
            else if (arr[j] - arr[i] < n)
                j++;
            else
                i++;
        }
 
        System.out.print("No such pair");
        return false;
    }
	
	static void pairsWithDiff_1(int[] arr,int k){
		
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			h.add(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++){
			int temp1 = arr[i]+k;
			if(h.contains(temp1)){
				System.out.println(arr[i]+" and "+temp1+" are pair with difference");
			} 
			
		}
	}
	public static void main(String [] args){
		int[] arr = {1,5,8,4,11,16,10};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		pairsWithDiff(arr, 5);
	}
}
