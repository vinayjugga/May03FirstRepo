package interview.program.answers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharacterString {

	public static void main(String[] args) {
		
		String str = "abadfdsaabdfeffaaaa" ;		
		
		HashMap<Character,Integer> map = new HashMap<>() ;
		
		for(int i=0; i<str.length()-1; i++)
		{
			if(map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			else
				map.put(str.charAt(i),1);
			
		}					
		
		System.out.println(map);		
		System.out.println("added the character");
		
		for(Map.Entry entry : map.entrySet())
		{
			System.out.println(entry.getKey() +" number of :"+entry.getValue());
		}
		
		
	}

}
