package how.flowchartexamplejava;

public class string1 {
	public static int wordcount(String s){
		boolean wordsolv = false;
	    int wCount = 0;

	    
	    int end = s.length() - 1;

	    for (int i = 0; i < s.length(); i++) {
	        if (Character.isLetter(s.charAt(i)) && i != end) {
	            wordsolv = true;
	        } else if (!Character.isLetter(s.charAt(i)) && wordsolv) {
	            wCount++;
	            wordsolv = false;
	        } else if (Character.isLetter(s.charAt(i)) && i == end) {
	            wCount++;
	        }
	    }
	    return wCount;
	}
	public static void main(String[] args) {
		System.out.println(wordcount("No, I am your father."));
	}

}
