/*
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
 */
public class Pattern39 {
public static void main(String[] args) {
    	for(int i=0;i<5;i++)
        	{
	for(int j=0;j<5;j++)
	{
	if(j+i>=4 )
	System.out.print(j+1+" ");//for cross line j+i+1
	else
	System.out.print(" ");
	}
	System.out.println();
	}

}
}
