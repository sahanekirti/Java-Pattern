/*
10000
02000
00300
00040
00005
 */

public class Pattern91 {
    public static void main(String[] args) {
        	for(int i=1;i<6;i++)
	{
	for(int j=1;j<6;j++)
	{
        	if(j-i==0)
	System.out.print(j);
	else
	System.out.print("0");
	}
	System.out.println();
	}

    }
}
