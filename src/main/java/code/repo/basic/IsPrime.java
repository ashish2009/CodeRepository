package code.repo.basic;

import java.util.Scanner;

public class IsPrime {

	static boolean isPrime(int num){
		int f_count = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0)
				f_count++;
		}
		if(f_count==2){
			return true;
		}else{
			return false;
		}
		
	}
	
	static void isPrime_1(){
		int j, x, flag = 0;
        System.out.print("Enter any number :");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        for( j = 2; j < x; j++)
        {
            if(x % j == 0)
            {
                flag = 0;
                break;
            }
            else
            {
                flag = 1;
            }
         }
         if(flag == 1)
         {
             System.out.println("The "+x+" is a prime number.");
         }
         else
         {
             System.out.println("The "+x+" is not a prime number.");
         }           
    }
	
	static boolean isCircularPrime(int num){
		int temp = num;
		boolean flag = true;
		do
		{
		   if(isPrime(temp)==false){
			   flag = false;
			   break;
		   }
		   temp = circulate(temp);
		}while(temp!=num);
		return flag;
	}
	
	static int circulate(int num){
		String s = Integer.toString(num);
		String p = s.substring(1)+s.charAt(0);
		int a = Integer.parseInt(p);
		return a;
	}
	
	public static void main(String[] args){
		System.out.println(isCircularPrime(1193));
	}
}
