/*
12345
2345
345
45
5
 */
public class Pattern37 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
	{
	for(int j=0;j<5;j++)
	{
	if(j+i<=4)
	System.out.print(j+i+1);//for cross line j+i+1
	else
	System.out.print(" ");
	}
	System.out.println();
	}

    }
}
