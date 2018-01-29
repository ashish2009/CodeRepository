package code.repo.recursion;

import java.util.ArrayList;

public class DiceRoll {
	
	static void diceRollHelper(int dice,ArrayList<Integer> choosen){
		System.out.println("diceHelper("+dice+","+choosen.toString()+")");
		if(dice==0){
			System.out.println(choosen.toString());
		}else{
			for(int i=1;i<=6;i++){
				choosen.add(i);
				diceRollHelper(dice-1,choosen);
				choosen.remove(choosen.size()-1);
			}
		}
	}
	
	static void diceRolls(int dice){
		ArrayList<Integer> choosen = new ArrayList<Integer>();
		diceRollHelper(dice, choosen);
	}
	
	public static void main(String[] args){
		diceRolls(2);
	}

}
