package code.repo.basic;

public class DecimalToBinary {

	static void convert(int num){
		int[] binary = new int[25];
		int index = 0;
		while(num>0){
			binary[index++] = num%2;
			num = num/2;
		}
		for(int i=index-1;i>=0;i--){
			System.out.print(binary[i]);
		}
	}
	
	public static void main(String...args){
		convert(225);
	}
}
