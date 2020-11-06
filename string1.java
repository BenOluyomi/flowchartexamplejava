package how.flowchartexamplejava;

public class string1 {
	public static int countWords(String s){

	    int wCount = 0;

	    boolean isword = false;
	    int end = s.length() - 1;

	    for (int i = 0; i < s.length(); i++) {
	 
	        if (Character.isLetter(s.charAt(i)) && i != end) {
	            isword = true;
	     
	        } else if (!Character.isLetter(s.charAt(i)) && isword) {
	            wCount++;
	            isword = false;
	            
	        } else if (Character.isLetter(s.charAt(i)) && i == end) {
	            wCount++;
	        }
	    }
	    return wCount;
	}
	public static void main(String[] args) {
		String word = "Hello there";
		countWords(word);

}
}