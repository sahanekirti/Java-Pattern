/*
   1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1
 */
public class Pattern46 {
    public static void main(String[] args) {
        	for(int i=0;i<9;i++)
	{
	for(int j=0;j<5;j++)
	{
	if(i<=4 && j+i>=4)
	System.out.print(i+1+" ");//
	else if(i>=5 && j-i>=-4)
   System.out.print(9-i+" ");
	else
	System.out.print(" ");
	}
	System.out.println();
	}

    }
}
