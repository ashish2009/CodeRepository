package code.repo.string.easy;

public class LongestConsecutiveChar {

	static void sequence(char[] c){
		int count = 1;
		int maxCount = 0;
		char ch = 0;
		for(int i=0;i<c.length-1;i++){
			if(c[i]==c[i+1]){
				count++;
			}else{
				count = 1;
			}
			
			if(count>maxCount){
				maxCount=count;
				ch = c[i];
			}
		}
		
		for(int j=0;j<maxCount;j++){
			System.out.print(""+ch);
		}
	}
	
	public static void main(String[] args){
		String s = "aaabcdeeeeefggggg";
		sequence(s.toCharArray());
	}
}
