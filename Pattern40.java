/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

 */
public class Pattern40 {
    public static void main(String[] args) {
        	for(int i=0;i<5;i++)
	{
	for(int j=0;j<5;j++)
	{
	if(j+i>=4)
	System.out.print(i+1+" ");//
	else
	System.out.print(" ");
	}
	System.out.println();
	}

    }
}
