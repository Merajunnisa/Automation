package practicePrograms;

import java.util.HashMap;

public class OccuranceOfEachCharInString {
	public static void countChars(String inputString) {
		char chars[] = inputString.toCharArray();
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		for(char c:chars) {
			if(countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c)+1);
			}
			else {
				countMap.put(c, 1);
			}
		}
		System.out.println(countMap);
	}

	public static void main(String[] args) {
	countChars("MerajMinhaj");
		}
	}
