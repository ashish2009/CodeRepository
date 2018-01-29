package code.repo.array.easy;

import java.util.HashSet;

public class DuplicateInArray {

	void findDuplicates(String[] strArray){
		for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[j]);
                }
            }
        }
	}
	
	void findDuplicate_1(String[] strArray){
		HashSet<String> set = new HashSet<String>();
		 
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
	}
}
