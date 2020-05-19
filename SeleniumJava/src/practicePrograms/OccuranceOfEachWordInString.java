package practicePrograms;

import java.util.HashMap;

public class OccuranceOfEachWordInString {
	
	public static void countWords(String inputString) {
		String str[] = inputString.split(" ");
		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		
		for(String s:str) {
			if(countMap.containsKey(s)) {
				countMap.put(s, countMap.get(s)+1);
			}
			else {
				countMap.put(s,1);
			}
		}
		System.out.println(countMap);
	}

	public static void main(String[] args) {
		countWords("This is an example word. This is a sentence");
		

	}

}
