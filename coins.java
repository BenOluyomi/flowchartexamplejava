package how.flowchartexamplejava;

public class coins {
	
	
	public static void main(String[] args) {
		  int payed = 2000;
		  int cost = 454;
		  
		  int change = payed - cost;
		  
		  int tens = (change -change%1000)/1000;
		  int newc = payed - cost - tens*1000;
		  int fives = (newc -change%500)/500;
		  int newco = newc -fives*500;
		  int twentyp = (newco -change%20)/20;
		  int newcos = newco -twentyp*20;
		  int tenp = (newcos -change%10)/10;
		  int newcost = newcos -tenp*10;
		  int two = (newcost -change%2)/2;
		  int newcosts = newcost -two*2;
		  int one = (newcosts -change%1)/1;
		  int newcostsi = newcosts -one*1;
		  
		  System.out.println(tens+ " 10 pound notes");
		  System.out.println(fives+ " 5 pound notes");
		  System.out.println(twentyp+ " 20ps");
		  System.out.println(one+ " 2ps");
		  System.out.println(one+ " 1ps");
	}

}
