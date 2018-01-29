package code.repo.string.joiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerTutorial {

	public static void main(String[] args) {
		 
		// StringJoiner is used to construct a sequence of characters separated by a delimiter and optionally starting with a
		// supplied prefix and ending with a supplied suffix.
 
		// Simple Delimiter Join
		JoinDelimiter();
 
		// Join using Prefix and Suffix
		StringJoinerWithPrefixSuffix();
 
		// Join using String Join
		SimpleStringJoin();
 
		// Join using ListJoiner
		listJoiner();
 
		// Collection Joiner
		collectorJoiner();
	}

	private static void JoinDelimiter() {
		StringJoiner myPhone = new StringJoiner(".");
		myPhone.add("123");
		myPhone.add("456");
		myPhone.add("7890");
		String phoneNumber = myPhone.toString();
		log("1. StringJoiner with simple delimiter: \t" + phoneNumber);
 
	}
 
	private static void StringJoinerWithPrefixSuffix() {
 
		// Constructs a StringJoiner with no characters in it using copies of the supplied prefix, delimiter and suffix.
		StringJoiner myDate = new StringJoiner("-", "{", "}");
		myDate.add("1985");
		myDate.add("11");
		myDate.add("22");
		String birthDate = myDate.toString();
		log("2. StringJoiner with Prefix and Suffix: " + birthDate);
 
	}
 
	private static void SimpleStringJoin() {
 
		// Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified
		// delimiter.
		String crunchifyFoundDate = String.join("/", "2012", "07", "01");
		log("3. Simple String Join: \t\t\t" + crunchifyFoundDate);
 
	}
 
	private static void listJoiner() {
		List<String> companyList = Arrays.asList("Crunchify LLC", "Google Inc", "Facebook Inc", "Amazon LLC");
 
		String companies = String.join(", ", companyList);
		log("4. Join List with Delimiter: \t\t" + companies);
 
	}
 
	private static void collectorJoiner() {
		List<String> tutorialList = Arrays.asList("Spring MVC", "Java", "NodeJS", "C Sharp");
 
		// joining: returns a Collector that concatenates the input elements, separated by the specified delimiter, in encounter
		// order.
		String tutorials = tutorialList.stream().map(crunchify -> crunchify).collect(Collectors.joining(" <==> "));
 
		log("5. Collector Joining: \t\t\t" + tutorials);
	}
 
	private static void log(String data) {
		System.out.println(data);
 
	}
}
