/*
10000
01000
00100
00010
00001
 */

public class Pattern90 {
    public static void main(String[] args) {
        	for(int i=0;i<5;i++)
	{
	for(int j=0;j<5;j++)
	{
	if(j-i==0)
	System.out.print("1");
	else
	System.out.print("0");
	}
	System.out.println();
	}

    }
}
