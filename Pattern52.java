
/*
 1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class Pattern52 {
    public static void main(String[] args) {
        int count=1;
	for(int i=0;i<5;i++)
	{
	for(int j=0;j<5;j++)
	{
        	if(j-i<=0)
	{
	System.out.print(count+++ " ");//
	}
	}
	System.out.println();
	}

    }
}
