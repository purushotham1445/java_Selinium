package PusrshothamAndMalli.PusrshothamAndMalli;

public class Example {

	public static void main(String[] args) {
		/*
		 * int []a = {3,45,35,6,97,35,}; int len=a.length; int max=a[0];
		 * 
		 * for(int i=0;i<len;i++) { if(a[i]>max) { max=a[i]; } }
		 * System.out.println("Largetst number in the Array  ::"+max);
		 * 
		 */
		int[] a = { 3, 45, 35, 6, 97, 35, };
		Example c = new Example();

		System.out.println(c.largestNumArr(a, 6));
	}

	public int largestNumArr(int a[], int total) {
		int temp=0;
		for (int i = 0; i < total; i++) {

			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		return temp;

	}

}
