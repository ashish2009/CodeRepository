package code.repo.string.easy;

import java.util.HashSet;
import java.util.LinkedList;

/*
 * This method remove character in pairs
 */

public class removeDuplicate {

	private static StringBuilder duplicates(String s) {
		HashSet<Character> h = new HashSet<Character>();
		StringBuilder result = new StringBuilder(); 

		for (int i = 0; i < s.length(); i++) {
			if (!h.contains(s.charAt(i))) {
				h.add(s.charAt(i));
			} else {
				h.remove(s.charAt(i));
			}
		}

		for (Character key : h) {
            result.append(key);
		}
		return result;
	}

	private static StringBuilder duplicatesUsingList(String s) {
		LinkedList<Character> list = new LinkedList<Character>();
		StringBuilder result = new StringBuilder(); 
		System.out.println("length: "+s.length()+"  "+"size: "+list.size());

		for (int i = 0; i < s.length(); i++) {
			if (!list.contains(s.charAt(i))) {
				list.add(s.charAt(i));
			} else {
				list.remove((Character)s.charAt(i));
			}
		}

		for (Character key : list) {
            result.append(key);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// abba,bbbaaccc

		String s = "bbbaaccc";
		System.out.println(duplicatesUsingList(s));

	}

}
