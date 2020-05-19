package practicePrograms;

public class ReverseEachWordInString {
	
	public static void reverseWord(String inputString) {
		String[] str = inputString.split(" ");
		String reverseString ="";
		for(int i=0;i<str.length;i++) {
			String reverse ="";
			String newStr = str[i];
			for(int j=newStr.length()-1; j>=0; j--) {
				reverse=reverse+newStr.charAt(j);
			}
			reverseString=reverseString+reverse+ " ";
		}
		System.out.println(reverseString);
	}

	public static void main(String[] args) {
		
		ReverseEachWordInString rev = new ReverseEachWordInString();
		
		rev.reverseWord("Meraj Unnisa Begum");

	}

}
