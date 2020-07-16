/**
 * 
 */
package sample;

/**
 * @author YOGESH
 *
 */
public class numberpattern1 {

	/**
	 * @param args
	 * 1
	 * 121
	 * 12321
	 * 1234321
	 * 123454321
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for (int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println("");
		}
		
		System.out.println("another pattern ");
		
		/**
		 * @param args
		 * 1
		 * 2 6
		 * 3 7 10
		 * 4 8 11 13
		 * 5 9 12 14 15
		 
		 * 
		 */
		for (int i=1;i<=5;i++)
		{
			int n =i;
			for (int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n=n+5-j;
			}
			System.out.println("");
		}
	}

}
