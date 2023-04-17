/*
*           *
 *         *
  *       *
   *     *
    *   *
     * *
      *
 */

public class Pattern117 {
    public static void main(String[] args) {
        	for(int i=0;i<7;i++)
	{
	for(int j=0;j<13;j++)
	{
	if(j-i==0 || j+i==12 )
	System.out.print("*");

	else
	System.out.print(" ");
	}
	System.out.println();
	}

    }
}
