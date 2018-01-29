package code.repo.array.easy;

import java.util.Arrays;
import java.util.HashSet;

public class commonElementBetweenArray {

	void findCommon(String[] arr1, String[] arr2) {
		HashSet<String> hs = new HashSet<String>();

		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		System.out.println("Common element between array : ");
		for (int j = 0; j < arr2.length; j++) {
			if(!hs.add(arr2[j])){
				System.out.print(arr2[j]+" ");
			}
		}
		
	}
	
	void findCommon_1(String[] arr1, String[] arr2){
		
        HashSet<String> set1 = new HashSet<>(Arrays.asList(arr1));
 
        HashSet<String> set2 = new HashSet<>(Arrays.asList(arr2));
 
        set1.retainAll(set2);
        System.out.println("Common element between array : ");
        System.out.println(set1);     
	}
	
	void findNotCommon(String[] arr1, String[] arr2) {
		HashSet<String> hs = new HashSet<String>();

		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		System.out.println("Not Common element between array : ");
		for (int j = 0; j < arr2.length; j++) {
			if(!hs.add(arr2[j]))
				hs.remove(arr2[j]);
		}
		
		System.out.println(hs.toString());
	}

	public static void main(String[] args) {
		String arr1[] = { "one", "two", "three", "four", "five", "six" };
		String arr2[] = { "two", "four", "six", "nine", "eight" };
		commonElementBetweenArray cea = new commonElementBetweenArray();
		cea.findCommon_1(arr1, arr2);
	}
}
