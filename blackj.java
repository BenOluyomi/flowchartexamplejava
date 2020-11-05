package how.flowchartexamplejava;

public class blackj {
	public static void sum(int a, int b, int c) {
		if(a ==b) {
			a = 0;
			b = 0;
			
		} else if(a ==c){
			a = 0;
			b = 0;
			
		} else if(b == c) {
			b = 0;
			c = 0;
		}
		int result = a + b + c;
		System.out.println(result);
	}
	public static void main(String[] args) {
		sum(5,5,5);
		sum(2,3,4);
		sum(18,4,4);
	}

}
