package code.repo.array.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class findMostFrequentElement {
	
	public void mostFrequent(int arr[]){
	
		HashMap<Integer,Integer> arrElementCount = new HashMap<Integer,Integer>();
		
		for(int i:arr){
			if(arrElementCount.containsKey(i)){
				arrElementCount.put(i, arrElementCount.get(i)+1);
			}else{
				arrElementCount.put(i, 1);
			}
		}
		int frequency = 1;
		int frequentEle = 0;
		
		for(Map.Entry<Integer, Integer> entry:arrElementCount.entrySet()){
			if(entry.getValue()>frequency){
				frequentEle = entry.getKey();
				frequency = entry.getValue();
			}
		}
		System.out.println("Frequent Element is: "+frequentEle+"      "+"Frequency is: "+frequency);
		
		
	}
	
	public static void main(String []args){
	
		int arr1[] = {3,5,7,2,7,3,9,4,3,9,9,9};
		findMostFrequentElement f = new findMostFrequentElement();
		f.mostFrequent(arr1);
	}

}
