package how.flowchartexamplejava;

public class uniquesum {
	public static void sum(int a, int b) {
		int result = a +b;
		System.out.println(result);
		
	}
	public static void mult(int a, int b) {
		int result = a *b;
		System.out.println(result);
		
	}
	
	
	
	public static void main(String[] args) {
		boolean truth = false;
		if(truth) {
			sum(5,5);
			sum(3,6);
		} else {
			mult(5,5);
			mult(3,6);
		}
        
    }
	
}