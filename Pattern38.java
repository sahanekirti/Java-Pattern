/*
 1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
 */
public class Pattern38 {
    public static void main(String[] args) {
        	for(int i=0;i<10;i++)
{
	for(int j=0;j<5;j++)
    	{
	if(j-i>=0 || j+i>=9)
	System.out.print(j+1+" ");//
	else
	System.out.print(" ");
	}
	System.out.println();
	}

    }
    
}
