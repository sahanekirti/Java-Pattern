/*
55555
45555
34555
23455
12345
 */

public class Pattern93 {
    public static void main(String[] args) {
        	for(int i=1;i<6;i++)
	{
	for(int j=1;j<6;j++)
	{
	if(j-i>=0)
	System.out.print("5");
	else
	System.out.print((j-i)+5);
	}
	System.out.println();
	}

    }
}
