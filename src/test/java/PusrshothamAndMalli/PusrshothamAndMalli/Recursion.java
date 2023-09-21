package PusrshothamAndMalli.PusrshothamAndMalli;

public class Recursion {

	public static int prinNumber(int i,int n){		
		if(i>n)  return 0;
		System.out.println(i);
		prinNumber(i+1,n);
		return 1;	
	}
	public static void main(String[] args) {

		
		int n=3;
		prinNumber(1, n);
		
	}

}
