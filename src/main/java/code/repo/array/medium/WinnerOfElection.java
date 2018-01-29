package code.repo.array.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WinnerOfElection {
	


	/* We have four Candidates with name as 'John',
    'Johnny', 'jamie', 'jackie'.
     The votes in String array are as per the
     votes casted. Print the name of candidates
     received Max vote. */
  public static void findWinner(String votes[])
  {
      // Insert all votes in a hashmap
      Map<String,Integer> map =
                  new HashMap<String, Integer>();
      for (String str : votes)
      {
          if (map.keySet().contains(str))
              map.put(str, map.get(str) + 1);
          else
              map.put(str, 1);
      }

      // Traverse through map to find the candidate
      // with maximum votes.
      int maxValueInMap = 0;
      String winner = "";
      for (Map.Entry<String,Integer> entry : map.entrySet())
      {
          String key  = entry.getKey();
          Integer val = entry.getValue();
          if (val > maxValueInMap)
          {
              maxValueInMap = val;
              winner = key;
          }

          // If there is a tie, pick lexicographically
          // smaller. 
          else if (val == maxValueInMap &&
              winner.compareTo(key) > 0)
              winner = key;
      }
      System.out.println("Winning Candidate is :" +
                                            winner);
  }
  
	static String candidateWithMaxVote(String[] arr){
		//Loop over arr
		//sort
		//if(arr[i]==arr[i-1]) count++
		//if(count>maxCount) maxCount = count & char = arr[i-1]
		int count = 1;
		int max = 1;
		String winner = arr[0];
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int i=1;i<arr.length;i++){
			if(arr[i].equals(arr[i-1])){
				count++;
			}else{
				count = 1;
			}
			
			if(count>max){
				max = count;
				winner = arr[i-1];
			}
		}
		
		System.out.println("Winner is "+winner+" with "+max+" vote");
		
		return winner;
		
	}
	
	public static void main(String[] args){
		String[] arr = {"john", "johnny", "jackie", 
                "johnny", "john", "jackie", 
                "jamie", "jamie", "john",
                "johnny", "jamie", "johnny", 
                "john","johnny"};
//		candidateWithMaxVote(arr);
		findWinner(arr);
	}
}
