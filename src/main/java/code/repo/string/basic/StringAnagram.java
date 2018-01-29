package code.repo.string.basic;

import java.util.Arrays;
import java.util.HashMap;

public class StringAnagram {
	
	static void isAnagram(String s1, String s2){
		
		String copyOfS1 = s1.replaceAll("\\s", "");
		String copyOfS2 = s2.replaceAll("\\s", "");
		
//		System.out.println(copyOfS1);
		
		boolean status = true;
		
		if(copyOfS1.length() != copyOfS2.length()){
			status = false;
		}else{
		
		char[] c1 = copyOfS1.toLowerCase().toCharArray();
		char[] c2 = copyOfS2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		status = Arrays.equals(c1, c2);
		
		}
		
		if(status){
			System.out.println("string "+s1+" and "+s2+" are anagrams");
		}else{
			System.out.println("string "+s1+" and "+s2+" are not anagrams");
		}
		
		
	}
	
	static void anagramProgram(String s1,String s2){
		
		String copyOfS1 = s1.replaceAll("\\s", "").toLowerCase();
		String copyOfS2 = s2.replaceAll("\\s", "").toLowerCase();
		
//		System.out.println(copyOfS1);
		
		boolean status = true;
		
		if(copyOfS1.length() != copyOfS2.length()){
			status = false;
		}else{
			HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
			
			for(int i =0;i<copyOfS1.length();i++){
				
				int count = 0;
				if(hm.containsKey(copyOfS1.charAt(i))){
					count = hm.get(copyOfS1.charAt(i));
				}
				
				count++;
				
				hm.put(copyOfS1.charAt(i), count);
				
				count = 0;
				
				if(hm.containsKey(copyOfS2.charAt(i))){
					count = hm.get(copyOfS2.charAt(i));
				}
				count--;
				hm.put(copyOfS2.charAt(i), count);
			}
			
			for(int values:hm.values()){
				if(values!=0) status = false;
			}
		}
		if(status){
			System.out.println("string "+s1+" and "+s2+" are anagram");
		}else{
			System.out.println("string "+s1+" and "+s2+" are not anagram");
		}
		
	}

	public static void main(String [] args){
		
		    isAnagram("Mother In Law", "Hitler Woman");
		 
	        isAnagram("keEp", "peeK");
	 
	        isAnagram("SiLeNt CAT", "LisTen AcT");
	 
	        isAnagram("Debit Card", "Bad Credit");
	 
	        isAnagram("School MASTER", "The ClassROOM");
	 
	        isAnagram("DORMITORY", "Dirty Room");
	 
	        isAnagram("ASTRONOMERS", "NO MORE STARS");
	 
	        isAnagram("Toss", "Shot");
	 
	        isAnagram("joy", "enjoy");
	        
	        System.out.println("====================================================================");
	        System.out.println("                                                                    ");
	        
	        anagramProgram("Mother In Law", "Hitler Woman");
			 
	        anagramProgram("keEp", "peeK");
	 
	        anagramProgram("SiLeNt CAT", "LisTen AcT");
	 
	        anagramProgram("Debit Card", "Bad Credit");
	 
	        anagramProgram("School MASTER", "The ClassROOM");
	 
	        anagramProgram("DORMITORY", "Dirty Room");
	 
	        anagramProgram("ASTRONOMERS", "NO MORE STARS");
	 
	        anagramProgram("Toss", "Shot");
	 
	        anagramProgram("joy", "enjoy");
	}
}
