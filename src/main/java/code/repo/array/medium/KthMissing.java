package code.repo.array.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class KthMissing {

	static int kthMissing(int[] arr1,Integer[] arr2,int k){
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr2));
		ArrayList<Integer> missing = new ArrayList<Integer>();
		
		for(int i=0;i<arr1.length;i++){
			if(!al.contains(arr1[i])){
				missing.add(arr1[i]);
			}
		}
		
		if(missing.size()>=k){
			return missing.get(k-1);
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		
		int a[] = {0, 2, 4, 6, 8, 10, 12, 14, 15};
        Integer b[] = {4, 10, 6, 8, 12};
        int k = 3;
        		  
		System.out.println(kthMissing(a, b, k));
	}
}
