package code.repo.array.basic;

public class isNumberOrNot {
	
	static boolean numberOrNot(String input)
	{
	    try
	    {
	        Integer.parseInt(input);
	    }
	    catch(NumberFormatException ex)
	    {
	        return false;
	    }
	    return true;
	}
	
	static void extractNumber(String input){
		StringBuilder sb = new StringBuilder();
		char[] ch = input.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(numberOrNot(""+ch[i]))
				sb.append(ch[i]);
		}
		System.out.println("Number is: "+sb);
	}
	
	
	public static void main(String [] args){
		String input = "asdd86dke233e";
	    extractNumber(input);
	}
}
