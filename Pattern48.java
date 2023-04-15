/*
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
 */
public class Pattern48 {
    public static void main(String[] args) {
	for(int i=0;i<9;i++)
    	{
	for(int j=0;j<9;j++)
	{
	if(j+i>=8)
	System.out.print((j+i)-7+" ");//
	else
System.out.print(" ");
	}
	System.out.println();
	}

    }
}
