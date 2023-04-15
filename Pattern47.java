/*
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9
 */

public class Pattern47 {
    public static void main(String[] args) {
        	for(int i=0;i<9;i++)
	{
	for(int j=0;j<9;j++)
	{
	if(j+i>=8)
	System.out.print(i+1+" ");//
	else
      System.out.print(" ");
	}
	System.out.println();
	}

    }
}
