/*
55555
54444
54333
54322
54321
 */

public class Pattern94 {
    public static void main(String[] args) {
        	for(int i=1;i<6;i++)
	{
	for(int j=1;j<6;j++)
	{
	if(j==1 || i==1)
	System.out.print("5");
	else if(j==2 || i==2)
	System.out.print("4");
	else if(j==3 || i==3)
	System.out.print("3");
	else if(j==4 || i==4)
	System.out.print("2");
	else
	System.out.print("1");
	}
	System.out.println();
	}

    }
}
