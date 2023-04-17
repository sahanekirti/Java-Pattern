/*
 ** **
*  *  *
 *   *
  * *
   *
   * 
   * 

 */

public class Pattern95 {
    public static void main(String[] args) {
        	for(int i=0;i<5;i++)
	{
	for(int j=0;j<7;j++)
	{
	if(j-i==-1 || j+i==7)
	System.out.print("*");

	else if(i==0 && j!=0 && j!=3 && j!=6)
	System.out.print("*");

	else if(i==1 && j!=1 && j!=2 && j!=4 && j!=5)
	System.out.print("*");

	else
	System.out.print(" ");
	}
	System.out.println();
	}

    }
}
