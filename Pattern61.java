/*
* *
** **
*** ***
**** ****
 */

public class Pattern61 {
    public static void main(String[] args) {
        	for(int i=0;i<9;i=i+2)
	{
	for(int j=0;j<9;j++)
	{
	if(j-i<=0)
	{
	if(i==2*j)
	System.out.print(" ");//
	else
	System.out.print("*");
	}
	}
	System.out.println();
}

    }
}
