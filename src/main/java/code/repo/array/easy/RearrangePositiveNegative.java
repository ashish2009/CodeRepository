package code.repo.array.easy;

public class RearrangePositiveNegative {
	
	private int[] numbers;
	private int number;
	
	public void rearrange(int[] values){
		this.numbers=values;
		this.number=values.length;
		
		seprateNumbers(0, number-1);
		
	}

	private void seprateNumbers(int low,int high){
		int i=low; int j=high;
		
		int pivote = 0;
		
		while(i<j){
			
			while(numbers[i]<pivote){
				i++;
			}
			
			while(numbers[j]>pivote){
				j--;
			}
			
			if(i<j){
				exchange(i,j);
			}
		}
	}
	
	private void exchange(int i,int j){
		int temp = numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=temp;
	}
	
	public static void main(String [] args){
		int[] t={-1,-5,3,7,-9,8,4,5,0};
		RearrangePositiveNegative rpn = new RearrangePositiveNegative();
		rpn.rearrange(t);
		for(int i:t){
			System.out.print(i+" ");
		}
		
	}
}
