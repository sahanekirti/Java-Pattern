/*

*    *********    *
**   **** ****   **
***  ***   ***  ***
**** **     ** ****
******       ******
 */

public class Pattern63 {
    public static void main(String[] args) {
        	for(int i=0;i<5;i++)
	{
	for(int j=0;j<19;j++)
	{
	if(j-i<=0|| j+i<=9 && j>=5 || j-i>=9 && j<=13 || j+i>=18)
	{
	System.out.print("*");
	}
	else
	System.out.print(" ");
	}
	System.out.println();
	}

    }
}
